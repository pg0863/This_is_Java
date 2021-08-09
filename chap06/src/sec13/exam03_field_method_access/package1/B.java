package sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a1 = new A();
		a1.field1 = 1; //접근가능
		a1.field2 = 1; //접근가능
		// a1.field3 = 1; // private 접근 불가
		
		a1.method1(); //접근가능
		a1.method2(); //접근가능
		// a1.method3(); // private 접근 불가
	}
}
