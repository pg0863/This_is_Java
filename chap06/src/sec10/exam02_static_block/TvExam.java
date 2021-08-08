package sec10.exam02_static_block;

public class TvExam {
	public static void main(String[] args) {
		System.out.println(Television.info);
		Television.info = "hi";
		System.out.println(Television.info);
		Television tv = new Television();
		System.out.println(tv.info); // 새로 객체 생성해도 다시 초기화되진 않네
		// System.out.println(Television.info); 로 사용하는게 바람직함.
		
		System.out.println(Television.from1To10Sum);
	}
}
