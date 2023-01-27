package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Bear animal=new Bear();
		System.out.println("-------곰-------");
		System.out.println("곰의 눈은 : "+animal.getEye()+"개");
		System.out.println("곰의 다리는 : "+animal.getLeg()+"개");
		System.out.println("특징은 : "+animal.woong);
        Lion animal2=new Lion();
        System.out.println("-------사자-------");
		System.out.println("사자의 눈은 : "+animal2.getEye()+"개");
		System.out.println("사자의 다리는 : "+animal2.getLeg()+"개");
		System.out.println("특징은 : "+animal2.galgi);
		Spider animal3=new Spider();
		System.out.println("-------거미-------");
		System.out.println("거미의 눈은 : "+animal3.getEye()+"개");
		System.out.println("거미의 다리는 : "+animal3.getLeg()+"개");
		System.out.println("특징은 : "+animal3.web);

	}

}
