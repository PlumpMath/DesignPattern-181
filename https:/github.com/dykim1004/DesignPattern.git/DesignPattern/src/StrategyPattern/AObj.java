package StrategyPattern;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj(){
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		ainterface.funcA();
		ainterface.funcA();
		// ~ 기능이 필요합니다. 개발해주세요.
		
	}
}
