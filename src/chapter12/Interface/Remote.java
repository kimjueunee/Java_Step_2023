package chapter12.Interface;

public interface Remote {
	
	//상수
	int MAX_VOLUME=0;
	int MIN_VOLUME=0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
