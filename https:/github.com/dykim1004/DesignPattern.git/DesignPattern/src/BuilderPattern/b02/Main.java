package BuilderPattern.b02;

public class Main {
	
	/*
	 * 가독성 & 많은 변
	 * 많은 인자를 가진 객체를 생성을 다른 객체의 도움으로 생성하는 패
	 */
	
	public static void main(String[] args) {
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.setStorage("256 ssd")
				.build();
		
		System.out.println(computer.toString());
	}
	
}
