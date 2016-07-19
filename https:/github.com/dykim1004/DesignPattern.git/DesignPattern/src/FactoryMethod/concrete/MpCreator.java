package FactoryMethod.concrete;

import java.util.Date;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 마력 물약 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("마 물약을 새로 생성했습니다."+new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
