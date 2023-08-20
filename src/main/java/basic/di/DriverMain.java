package basic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
//		KumhoTire k = new KumhoTire();
//		Car car2 - new Car();
//		car2.printTireBrand();
//		Car car = new Car();
//		HankookTire hankook = new HankookTire();
//		KumhoTire kumho = new KumhoTire();
//		
//		car.setTire(kumho);
//		car.printTireBrand();
		ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml");
		
	}
}
