package spring.impls.moto;

import spring.interfaces.Motorcycle;

public class MotorcycleNotRun implements Motorcycle {

	public MotorcycleNotRun(){
		
	}
	
	@Override
	public void race() {
	
		System.out.println("I am not going anywhere. I Override metod run.");
		
	}

}
