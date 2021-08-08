package sec10.exam03_static_be_careful;

public class Car {
	int speed1;
	static int speed2;
	
	void run1() {
		System.out.println(speed1+"으로 달립니다.");
	}
	static void run2() {
		System.out.println(speed2+"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed1 = 80;
		myCar.run1();
		
		Car.speed2 = 100;
		Car.run2();
	}
}
