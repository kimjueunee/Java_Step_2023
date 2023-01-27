package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {


		SmartTelevision tv=new SmartTelevision();
		
		tv.turnOn();
	    tv.setVolume(10);
	    tv.turnOff();
	    tv.search("www.naver.com");
	    System.out.println("-------------------------");
	  
	    //Remote 클래스에 정의 되어 있는 메소드만 오버라이딩이 인식되어사용할 수 있음
	    Remote rc=tv;
	    rc.turnOn();
	    rc.setVolume(-7);
	    rc.turnOff();
	    //rc.search("www.naver.com");
	    
	    Searchable sc=tv;
	    /*sc.turnOn();
	    sc.setVolume(-7);
	    sc.turnOff();*/
	    sc.search("www.naver.com");

	}

}
