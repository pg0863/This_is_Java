package sec02.exam02_Constant_field;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/*
	int MIN_VOLUME;
	static {
		MIN_VOLUME = 0;
	}
	*/
	// 선언과 동시에 초기화하지 않으면 오류
}
