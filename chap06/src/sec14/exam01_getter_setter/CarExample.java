package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println(myCar.isStop()); // 기본값 false
		
		myCar.setSpeed(-60);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		myCar.setSpeed(60);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : "+myCar.getSpeed());
		System.out.println(myCar.isStop());
	}
}
