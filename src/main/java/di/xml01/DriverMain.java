package di.xml01;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		//xml기반의 스프링 컨테이너 만들어야 함
		ApplicationContext context =  new GenericXmlApplicationContext("spring-xml01.xml");
		//생성자 주입
		Car localcar = (Car)context.getBean("car");
		localcar.printTireBrand();
		
		Car car5 = (Car)context.getBean("car5");
		List<String> list = car5.getDriver();
		for(String string:list) {
			System.out.println(string);
		}
		
		Car car6 = (Car) context.getBean("car6");
		Map<String, String> map = car6.getAS();
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
