package sec04.exam01_overriding;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의  arearCircle() 실행");
		return Math.PI * r * r;
	}
	
}
