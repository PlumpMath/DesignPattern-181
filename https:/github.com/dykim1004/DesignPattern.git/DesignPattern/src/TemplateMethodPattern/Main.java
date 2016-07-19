package TemplateMethodPattern;

import TemplateMethodPattern.dp.DefaultGameConnectHelper;
import TemplateMethodPattern.dp.GameConnectHelper;

public class Main {
	// 일정한 프로세를 가진 요구항을 탬플릿 메소드 패턴을 이용하여 구현할 수 있다.
	// 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패
	
	// 구현하려는 알고리즘이 일정한 프로세스가 있다.
	// 구현하려는 알고리즘이 변경 가능성이 있다.
	
	/* 
	 * 1. 알고리즘을 여러 단계로 나눈다.
	 * 2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
	 * 3. 알고리즘을 수행할 템플릿 메소드를 만든다.
	 * 4. 하위 클래스에서 나눠진 메소드들을 구현한다.
	 */
	
	public static void main(String[] args) {
		GameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}
	
}
