package sec06.exam01_protected_package2;

import sec06.exam01_protected_package01.A;

public class D extends A {
	public D() {
		super(); // 생략 가능
		this.field = "value";
		this.method();
	}
	public void method() {
		
		this.field = "value";
		this.method();
	}
}
