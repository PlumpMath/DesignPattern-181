package FactoryMethod;

import FactoryMethod.concrete.HpCreator;
import FactoryMethod.concrete.MpCreator;
import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class Main {
	/*
	 * 학습목표
	 * 팩토리 메소드 패턴에서 템플릿 메소드 패턴의 사용됨을 안다.
	 * 팩토리 메소드 패턴에서의 구조와 구현의 분리를 이해하고구조와 구현의 분리의 장점을 안다.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		creator = new HpCreator();
		item = creator.create();
		item.use();
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}	
}
