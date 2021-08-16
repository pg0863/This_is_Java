package sec07.exam02_promotion_access;

public class ChildExam {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // child 클래스에서 재정의된 메소드 실행.
		// parent.method3();
		// Parent형으로 형변환 되었으므로 method3() 메소드 사용 불가. 
	}
}
