package AbstractFactoryPattern;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;
import AbstractFactoryPattern.gt.GtBikeFactory;
import AbstractFactoryPattern.sam.SamFactory;

public class Main {
	public static void main(String[] args) {
		
		//BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
