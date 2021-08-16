package sec03.exam01_parent_constructor_call;

public class StudentExampe {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "1234-5678", 1);
		// student 객체가 먼저 호출이 되기 시작했지만, 부모 객체인 People부터 호출이 완료된다.
		System.out.println("name: "+student.name);
		System.out.println("ssn: "+student.ssn);
		System.out.println("studentNo: "+student.studentNo);
	
	}

}
