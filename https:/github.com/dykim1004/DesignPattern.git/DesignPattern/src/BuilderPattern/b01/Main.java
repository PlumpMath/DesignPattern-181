package BuilderPattern.b01;

import javax.xml.parsers.FactoryConfigurationError;

public class Main {
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramPrint());
		//Computer computer = factory.makeAndGet();
		factory.make();
		Computer computer = factory.getComputer();
		
		
		System.out.println(computer.toString());
	}
}
