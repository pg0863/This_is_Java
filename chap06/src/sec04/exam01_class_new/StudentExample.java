package sec04.exam01_class_new;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		// 클래스 클래스변수 = new 생성자();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("S2 변수가 또 다른 Student 객체를 참조합니다.");
		
	}

}
