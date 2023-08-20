package basic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자입니다.");
	}
	public Car(Tire t) {
		System.out.println("Car(t) 생성자입니다.");
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		System.out.println("setTire(Tire tire)입니다");
		this.tire = tire;
	}
	
	public void printTireBrand() {
		System.out.println("타이어 브랜드는 " + tire.getTireBrand());
	}
	
}
