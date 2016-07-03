package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.impls.moto.MotorcycleMe;
import spring.impls.moto.MotorcycleNotRun;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			
		MotorcycleMe me = (MotorcycleMe) context.getBean("memoto");
		me.race();
		
		MotorcycleMe your = (MotorcycleMe) context.getBean("yourmoto");
		your.race();
		
		MotorcycleNotRun notrun = (MotorcycleNotRun) context.getBean("notrun");
		notrun.race();
		}
}
