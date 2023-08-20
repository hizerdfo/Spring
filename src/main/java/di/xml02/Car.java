package di.xml02;

public class Car {

	private Tire tire;
	private Tire stire;
	
	public Tire getStire() {
		return stire;
	}

	public void setStire(Tire stire) {
		this.stire = stire;
	}

	String carName;
	int year;
	
	
	@Override
	public String toString() {
		return "Car [tire=" + tire + "+ tire = " + stire + ", carName=" + carName + ", year=" + year + "]";
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
	
	public Car() {
		System.out.println("Car() 생성자입니다.");
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
	public void printSTireBrand() {
		System.out.println("스페어 타이어는 " + stire.getTireBrand());
	}
	
}
