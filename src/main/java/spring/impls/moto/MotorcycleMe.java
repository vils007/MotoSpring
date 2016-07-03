package spring.impls.moto;

import spring.interfaces.Motor;
import spring.interfaces.Wheels;


public class MotorcycleMe implements spring.interfaces.Motorcycle {

	private Motor motor;
	private Wheels wheels;
	
	public MotorcycleMe() {
		
	}

	public MotorcycleMe(Motor motor, Wheels wheels) {
		super();
		this.motor = motor;
		this.wheels = wheels;
	}

	@Override
	public void race() {
			
		motor.sound();
		wheels.run();
		
	}

}
