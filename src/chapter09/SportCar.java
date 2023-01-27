package chapter09;

public class SportCar extends Car {
	
	public void speedUp() {
		speed+=10;
		System.out.println("speed : "+speed);
	}
	
	/*
	//final이므로 재정의가 안됨
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed=0;
	}
	*/

	public static void main(String[] args) {
		SportCar ac=new SportCar();
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();

	}

}
