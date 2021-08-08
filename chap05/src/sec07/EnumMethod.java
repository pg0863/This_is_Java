package sec07;

public class EnumMethod {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name); //SUNDAY
		
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6 일월화수목
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); // -2
		System.out.println(result2); //2
		
		Week[] days = Week.values();
		// System.out.println(days); //[Lsec07.Week;@15db9742 // ??머지
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
