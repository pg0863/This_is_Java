package sec10.exam04_singleton;

public class SingletonExam {
	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Single();
		 Singleton obj2 = new Singleton();
	    */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}
}
