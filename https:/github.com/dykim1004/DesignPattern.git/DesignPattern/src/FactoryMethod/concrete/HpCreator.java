package FactoryMethod.concrete;


import java.util.Date;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 회복 물략의 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 물약을 새로 생성했습니다."+new Date());
	}

	@Override
	protected Item createItem() {
		//작업
		return new HpPotion();
	}

}
