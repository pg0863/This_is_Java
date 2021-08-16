package sec07.exam06_casting;

public class ChildExam {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method1(); // Parent-method1() 출력
		child.method2(); // Parent-method1() 출력
		child.method3();
		
	}
}
