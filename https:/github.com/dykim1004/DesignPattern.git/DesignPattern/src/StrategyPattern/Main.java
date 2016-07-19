package StrategyPattern;

import StrategyPattern.example.Ax;
import StrategyPattern.example.GameCharacter;

public class Main {
	public static void main(String[] args){
		
		/** 
		 * 스트레티지 패턴
		 * 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록하는 패턴
		 * 인터페이스(기능의 선언과구현을 분), 델리게이트(위임)
		 * 
		 * 요구사항
		 * 신작 게임에서 캐릭터와 무기를 구현해보세요.
		 * 무기 종류는 검, 
		 */
		
//		Ainterface ainterface = new AinterfaceImpl();
//		//통로
//		ainterface.funcA();
//		
//		AObj aObj = new AObj();
//		aObj.funcAA();
		
		GameCharacter character = new GameCharacter();
		character.setWeapon(new Ax());
		character.attack();
	}
}
