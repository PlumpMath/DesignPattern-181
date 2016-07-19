package AbstractFactoryPattern.sam;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
