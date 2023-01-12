package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int num1=Integer.parseInt(scan.nextLine());
		Guide obj=new Guide(num1);
		System.out.println("관광객 등록");
		for(int a=1;a<=num1;a++) {
			System.out.print(a+". 이름 : ");
			String name=scan.next();
			obj.guest[a-1].setName(name);	
			System.out.print(a+". 성별 : ");
			String gender=scan.next();
			obj.guest[a-1].setGender(gender);
			System.out.println("----------------------------");
		}
		String point2;
		boolean run=true;
		while(run) {
			System.out.println("1.관광객 정보\n2.목적지 변경\n3.종료");
			System.out.print("선택 >> ");
			int n=scan.nextInt();
			switch (n) {
			case 1:
				for(int a=1;a<=num1;a++) {
					obj.guest[a-1].getName();
					obj.guest[a-1].getGender();
					System.out.println(a+". 이름 : "+obj.guest[a-1].getName()+"\n"+a+". 성별 : "+obj.guest[a-1].getGender()+"\n"+a+". 목적지 : "+obj.guest[a-1].getPoint());
				    System.out.println("---------------------------------------------");
				}
				break;
			case 2:
				System.out.print("어디로 변경하시겠습니까? : ");
				Guide.point=point2=scan.next();
				System.out.println(point2+"로 목적지 변경");
				System.out.println("==================================================");
				break;

			default:
				System.out.println("종료");
				run=false;
			}
		}
		
		

	}

}

