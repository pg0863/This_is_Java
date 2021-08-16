package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone(); 추상 클래스이므로 생성자X
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); // 상속받은 메소드
		smartPhone.turnOff(); // 상속받은 메소드
		smartPhone.internetSearch(); // 추가한 메소드
	}
}
