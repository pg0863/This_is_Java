package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue); // '가'의 유니코드 번호
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue = 1000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
		
	}
}
