package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "100");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
	}
}
