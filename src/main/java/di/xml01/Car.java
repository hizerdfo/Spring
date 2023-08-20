package di.xml01;

import java.util.List;
import java.util.Map;

public class Car {

	private Tire tire;
	private String carName;
	private int year;
	private List<String> driver;
	private Map<String, String> AS;
	
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<String> getDriver() {
		return driver;
	}
	public void setDriver(List<String> driver) {
		this.driver = driver;
	}
	public Car() {
		System.out.println("Car() 생성자입니다.");
	}
	public Car(Tire t) {
		this.tire=t;
		System.out.println("Car(t) 생성자입니다.");
	}
	public Car(String carname, Tire t) {
		this.tire = t;
		System.out.println("car(Tire t) 생성자입니다.");
	}
	public Car(String carname, int year, Tire t) {
		this.tire = t;
		System.out.println("Car(t) 생성자입니다.");
	}
	public void printTireBrand() {
		System.out.println("타이어 브랜드는 " + tire.getTireBrand());
	}
	public Map<String, String> getAS() {
		return AS;
	}
	public void setAS(Map<String, String> aS) {
		AS = aS;
	}
	
}
