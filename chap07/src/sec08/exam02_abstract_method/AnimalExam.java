package sec08.exam02_abstract_method;

public class AnimalExam {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		// Animal animal2 = new Animal(); 오류
		
		System.out.println("강아지는 "+dog.kind);
		dog.sound();
		System.out.println("고양이는 "+cat.kind);
		cat.sound();
		System.out.println("------------------------------"); 
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------------------------------");
		animalSound(new Dog());
		animalSound(new Cat());
	}
	// Dog 객체가 대입되면 dog객체의 메소드, cat 객체가 대입되면 cat객체 메소드
	public static void animalSound(Animal animal) {
		animal.sound();////
	}
}
