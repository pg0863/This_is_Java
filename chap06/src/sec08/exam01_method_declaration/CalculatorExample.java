package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator Calc1 = new Calculator();
		Calc1.powerOn();
		
		int result1 = Calc1.plus(1, 5);
		System.out.println("result1 : "+result1);
	}

}
