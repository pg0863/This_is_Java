package sec03.exam03_multi_implement_class;

public class RemoteControlExam {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = (RemoteControl)tv; 
		// RemoteControl rc = tv; 왜 안되지??
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable searchable = tv;
		searchable.search("http://cafe.mobilewebapp");
	}

}
