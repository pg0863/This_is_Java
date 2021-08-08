package sec02;

public class IfElseExample {
	public static void main(String[] args) {
		
		/*
		int score = 85;
		char grade='A';
		
		if (score>=90) {
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
			System.out.println(grade);
		} else if (score>=70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("학점은 "+grade+"입니다.");
		*/
		
		int score = (int)(Math.random()*100);
		char grade;
		switch(score/10) {
		case 10:
			grade='A';
			break;
		case 9:
			grade='B';
			break;
		case 8:
			grade='C';
			break;
		default:
			grade='F';
			break;
		}
		System.out.println("점수 : "+score);
		System.out.println("학점은 "+grade+"입니다.");
	}
}
