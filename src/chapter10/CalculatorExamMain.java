package chapter10;

public class CalculatorExamMain {
	
	//Main에서 실행하여 아래와 같은 결과가 나오면 성공
	//CalPlus : 30
	//CalMinus : 15

	public static void main(String[] args) {
		CalPlus p=new CalPlus();
		System.out.println("CalPlus : "+p.getResult(15, 15));
		CalMinus m=new CalMinus();
		System.out.println("CalMinus : "+m.getResult(30, 15));
	}

}
