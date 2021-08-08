package ex;

public class ex04 {
	public static void main(String[] args) {
		// 눈의 합이 5가 아니면 계속 주사위를 던지고, 5이면 실행을 멈추는 코드
		int a, b, sum;
		do {
			a = (int)(Math.random()*6) + 1;
			b = (int)(Math.random()*6) + 1;
			sum=a+b;
			System.out.println(a+", "+b);
		} while (sum != 5);
		
	}
}
