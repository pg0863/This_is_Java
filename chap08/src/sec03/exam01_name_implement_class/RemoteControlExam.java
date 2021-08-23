package sec03.exam01_name_implement_class;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Television();
		RemoteControl rc2 = new Audio();

		rc1.turnOn();
		rc2.turnOn();
	}

}
