package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		// B b1 = d;
		// C c1 = e;
		
		// 서로 상속 관계선상에 있지 않으므로 오류
		// B b3 = e;
		// C c2 = d;
	}
}
