package spring.impls.honda;

import spring.interfaces.Motor;

public class HondaMotor implements Motor {

	@Override
	public void sound() {
		System.out.println("HOOOOONDAAAAA!!!");
		
	}
	

}
