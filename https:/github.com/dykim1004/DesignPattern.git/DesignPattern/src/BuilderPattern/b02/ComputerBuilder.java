package BuilderPattern.b02;

public class ComputerBuilder {
	private Computer computer;
	private ComputerBuilder(){
		computer = new Computer("defalut","defalut","defalut");
	}
	
	public static ComputerBuilder start(){
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setCpu(String str){
		computer.setCpu(str);
		return this;
	}

	public ComputerBuilder setRam(String str) {
		computer.setRam(str);
		return this;
	}
	
	public ComputerBuilder setStorage(String str){
		computer.setStorage(str);
		return this;
	}

	public Computer build() {
		return this.computer;
	}
}
