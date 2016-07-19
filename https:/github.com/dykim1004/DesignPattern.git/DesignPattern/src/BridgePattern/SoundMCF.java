package BridgePattern;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.println("삣");
	}

	@Override
	public void dash() {
		System.out.println("삐~");
	}

	@Override
	public void space() {
		System.out.println(" ");
	}

}
