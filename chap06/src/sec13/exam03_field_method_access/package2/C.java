package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a1 = new A();
		a1.field1 = 1; //접근가능
		// a1.field2 = 1; // default 다른패키지 접근 불가
		// a1.field3 = 1; // default 다른패키지 접근 불가
		
		a1.method1(); //접근가능
		// a1.method2(); // default 다른패키지 접근 불가
		// a1.method3(); // default 다른패키지 접근 불가
	}
}
