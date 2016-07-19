package AbstractFactoryPattern02;

import AbstractFactoryPattern02.abst.Button;
import AbstractFactoryPattern02.abst.GuiFactory;
import AbstractFactoryPattern02.abst.TextArea;
import AbstractFactoryPattern02.concrete.FactoryInstance;

public class Main {
	public static void main(String[] args) {
		GuiFactory factory = FactoryInstance.getGuiFactory();
		Button button = factory.createButton();
		TextArea area =  factory.createTextArea();
		button.click();
		System.out.println(area.text());
	}
}
