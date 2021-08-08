package sec05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "박의근";
		String strVar2 = "박의근";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 같은 객체를 참조한다.");
		} else {
			System.out.println("참조가 다르다.");
		}
		
		String strVar3 = new String("박의근");
		String strVar4 = new String("박의근");
		if(strVar3 == strVar4) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("strVar3과 strVar4는 서로 다른 객체를 참조한다.");
		}
		
		if(strVar3.equals(strVar4)){
			System.out.println("문자열이 같다.");
		}
	}
}
