package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		//VIP고객
		int price=10000;
		System.out.println("----------------VIP고객---------------");
		VIPCustomer vipcs=new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("--------------일반고객--------------------");
		price=10000;
		Customer ge=new Customer(2002, "김주은");
		int geprice=ge.calcPrice(price);
		System.out.println(ge.getCustomerName()+"님이 "+geprice+"원을 지불 완료하였습니다.");
		System.out.println(ge.showCustomer());
		

	}

}
