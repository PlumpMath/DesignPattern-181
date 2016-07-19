package PrototypePattern;

public class Main {
	/*
	 * 1. 프로토 타입 패턴을 통해서 복잡한 인스턴스를 복사 할 수 있다.
	 * 
	 * 2. 깊은 복사, 얕은 복
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 기본 프로토타입 패턴 예제
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX()+","+circle1.getY()+","+circle1.getR());
		System.out.println(circle2.getX()+","+circle2.getY()+","+circle2.getR());
		*/
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		Cat yo = navi.copy();
		yo.setName("yo");
		yo.setAge(new Age(2016, 1));
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		
		System.out.println(yo.getName());
		System.out.println(yo.getAge().getYear());
		System.out.println(yo.getAge().getValue());
		
	}
}
