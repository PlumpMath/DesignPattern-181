package BridgePattern;

public class Main {
	/*
	 * 기능 계층과 구현 계층의 분리
	 * 어댑터 패턴과 브릿지 패턴을 연결하여 이해
	 * 예제 - 모스부호
	 */
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new FlashMCF());
		code.g().a().r().a().r().m();
	}
}
