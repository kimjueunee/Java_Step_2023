package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			String num = scan.next();
			char num2=num.charAt(0);
			//문자를 아스키코드로 형변환
			//charAt(0):문자(char) 또는 문자열(String) => ASCII 즉 int
			//char input=scan.next().charAt(0);
			//System.in.read() : 콘솔에 입력받기 모든 이력값을 아스키코드값
			//int ch=System.in.read(); //아스키코드값
			char ch1='R';
			char ch2='r';
			char ch3='L';
			char ch4='l';
			char ch5='P';
			char ch6='p';
			char ch7='S';
			char ch8='s';
			
			Scheduler scheduler=null;
			PriorityAllocation pr=new PriorityAllocation();
			LeastJob le=new LeastJob();
			RoundRobin ro=new RoundRobin();
			//객체 생성
			if(num2==ch1||num2==ch2) {
				ro.getNextCall();
				ro.sendCallToAgent();
			}else if(num2==ch3||num2==ch4) {
				le.getNextCall();
				le.sendCallToAgent();
			}else if(num2==ch5||num2==ch6) {
				pr.getNextCall();
				pr.sendCallToAgent();
			}else if(num2==ch7||num2==ch8) {
				break;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
				continue;
			}
		}
		System.out.println("업무를 종료합니다.");

	}

}
