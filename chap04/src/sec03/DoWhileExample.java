package sec03;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		Scanner sc = new Scanner(System.in);
		// Scanner는 기본 타입이 아닌 class타입이므로 패키지를 import해줘야 함.
		// ctrl+shift+o 자동으로 import
		
		//#받은 값 그대로 출력
		//String inputString = sc.nextLine(); 
		//System.out.println(inputString);
		
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while(!inputString.contentEquals("q"));
		System.out.println("프로그램 종료");
	}
}
