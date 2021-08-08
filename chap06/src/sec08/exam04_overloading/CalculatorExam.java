package sec08.exam04_overloading;

public class CalculatorExam {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(40);
		double result2 = myCalc.areaRectangle(30, 50);
		System.out.print(result1+"\n");
		System.out.print(result2);
	}
}
