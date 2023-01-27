package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone=new DmbCellPhone("Java폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색깔 : "+dmbCellPhone.color);
		System.out.println("----------------------------------");
		//DmbCellphone의 필드
	    System.out.println("채널 : "+dmbCellPhone.channel);
		System.out.println("----------------------------------");
		//CellPhone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("엄마");
		dmbCellPhone.receiveVoice("왜그러니?");
		dmbCellPhone.sendVoice("배고파");
		dmbCellPhone.receiveVoice("밥먹어라");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		System.out.println("----------------------------------");
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(5);
		dmbCellPhone.turnOffDmb();
	}
	
}
