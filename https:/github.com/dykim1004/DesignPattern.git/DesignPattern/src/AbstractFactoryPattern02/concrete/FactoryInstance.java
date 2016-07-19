package AbstractFactoryPattern02.concrete;

import AbstractFactoryPattern02.abst.Button;
import AbstractFactoryPattern02.abst.GuiFactory;
import AbstractFactoryPattern02.abst.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFactory() {
		switch (getOsCode()) {
			case 0:
				return new MacGuiFactory();
			case 1:
				return new LinuxGuiFactory();
			case 2:
				return new WinGuiFactory();	
			default:
				break;
		}
		return null;
	}

	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Mac OS X")){
			return 0;
		}else{
			return 1;
		}
	}

}

class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}


class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼 클릭");
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String text() {
		return "리눅스 텍스트 에어리어";
	}

}

class MacGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}


class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 버튼 클릭");
	}

}

class MacTextArea implements TextArea {

	@Override
	public String text() {
		return "맥 텍스트 에어리어";
	}

}

class WinGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 클릭");
	}

}

class WinTextArea implements TextArea {

	@Override
	public String text() {
		return "윈도우 텍스트 에어리어";
	}

}


