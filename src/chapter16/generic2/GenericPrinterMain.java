package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> ge=new GenericPrinter<Powder>();
		Powder p1=new Powder();
		ge.setmaterial(p1);
		System.out.println(p1);
		p1.doprinting();
		System.out.println();
		GenericPrinter<Plastic> ge2=new GenericPrinter<Plastic>();
		Plastic p2=new Plastic();
		ge2.setmaterial(p2);
		System.out.println(p2);
		p2.doprinting();
		System.out.println();
		//물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
		/*
		GenericPrinter<Water> ge3=new GenericPrinter<Water>();
		Water p3=new Water();
		System.out.println(p3);*/
	}

}
