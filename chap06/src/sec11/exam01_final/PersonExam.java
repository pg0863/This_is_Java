package sec11.exam01_final;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("*123456-1234567", "홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		// p1.nation = "japan"; // nation은 final 변수이므로 에러
		p1.name = "박의근";
		// p1.ssn = "123-456"; // ssn은 final 변수이므로 에러
	}

}
