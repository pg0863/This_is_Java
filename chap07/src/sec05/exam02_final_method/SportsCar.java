package sec05.exam02_final_method;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 5;
	}
	// public void stop() {} // final로 선언된 메소드 재정의 불가.
}
