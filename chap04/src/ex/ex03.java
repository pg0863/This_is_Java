package ex;

public class ex03 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
		int i; 
		int sum=0;
		for(i=1; i<=100; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
