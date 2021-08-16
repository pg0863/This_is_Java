package sec04.exam01_overriding;

public class ComputerExam {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원의 면적 : "+calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("원의 면적 : "+computer.areaCircle(r));
	}

}
