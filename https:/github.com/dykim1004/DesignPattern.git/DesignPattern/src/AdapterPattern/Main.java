package AdapterPattern;

public class Main {
	//부가기구
	/*
	 * 요구사항
	 * 두 수에 대한 다음 연산을 수행하는 객체를 만들어 주세요.
	 * 1. 수의 두 배의 수를 반환(flat)
	 * 2. 수의 반(1/2)의 수를 반환(flat)
	 * 구현 객체 이름은 'Adapter'
	 * 
	 */
	public static void main(String[] args){
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
		
	}
	
}
