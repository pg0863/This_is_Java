package sec06.exam01_protected_package2;

import sec06.exam01_protected_package01.A;

public class C {
	
	
	public void method() {
		// 다른 패키지이고, 자식 클래스가 아니므로 오류
		//A a = new A();
		//a.field = "value";
		//a.method();
	}
}
