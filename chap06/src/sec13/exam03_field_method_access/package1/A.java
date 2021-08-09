package sec13.exam03_field_method_access.package1;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; //접근가능
		field2 = 1; //접근가능
		field3 = 1; //접근가능
		
		method1(); //접근가능
		method2(); //접근가능
		method3(); //접근가능
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
