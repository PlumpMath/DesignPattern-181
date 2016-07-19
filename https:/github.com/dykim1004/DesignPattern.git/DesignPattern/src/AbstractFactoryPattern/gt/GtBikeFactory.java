package AbstractFactoryPattern.gt;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
