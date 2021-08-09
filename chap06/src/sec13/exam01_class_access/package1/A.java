package sec13.exam01_class_access.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
	
	public A(boolean b) {}
	A() {} // 디폴트 생성자
	
	private A(String s) {}
	
}
