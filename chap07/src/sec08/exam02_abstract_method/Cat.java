package sec08.exam02_abstract_method;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	// 추상클래스의 추상메소드를 상속받은 실체클래스는 반드시 추상메소드를 구현해야 한다.
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
