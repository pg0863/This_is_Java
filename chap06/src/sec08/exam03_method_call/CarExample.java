package sec08.exam03_method_call;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		System.out.println();
		
		int speed = myCar.getSpeed(); // speed = 0
		System.out.println("현재 속도 : "+speed+"km/h");
		
		myCar.run();
		
		speed = myCar.getSpeed(); // speed = 50
		System.out.println("현재 속도 : "+speed+"km/h");
		
	}

}
