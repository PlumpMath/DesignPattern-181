package BridgePattern;

public class FlashMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.println("#");
	}

	@Override
	public void dash() {
		System.out.println("-*-");
	}

	@Override
	public void space() {
		System.out.println(" ");
	}

}
