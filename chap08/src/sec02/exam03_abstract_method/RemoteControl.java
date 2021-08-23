package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// public abstract가 자동적으로 붙음.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
 	// 실행 블록을 가지면 오류.
}
