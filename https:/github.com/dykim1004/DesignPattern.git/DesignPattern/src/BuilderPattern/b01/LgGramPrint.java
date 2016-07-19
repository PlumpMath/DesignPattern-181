package BuilderPattern.b01;

public class LgGramPrint extends BluePrint {
	
	private Computer computer;
	
	public LgGramPrint(){
		computer = new Computer("default", "default", "default");
	}
	

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256 ssd");
	}


	@Override
	public Computer getComputer() {
		return computer;
	}

}
