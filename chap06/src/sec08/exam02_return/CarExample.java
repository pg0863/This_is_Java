package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		//myCar.run();
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){
			System.out.println("가스 주입 필요 없다.");
		} else {
			System.out.println("가스 주입해야한다.");
		}
	}

}
