package ex;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:
				System.out.print("예금액>");
				int num2 = sc.nextInt();
				sum=sum+num2;
				break;
			case 2:
				System.out.print("출금액>");
				num2 = sc.nextInt();
				sum=sum-num2;
				break;
			case 3:
				System.out.println("잔고>"+sum);
				break;
			case 4:
				run=false;
				System.out.println("\n프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해주세요(1~5)");
			}
			System.out.println();
		}
	}
}
