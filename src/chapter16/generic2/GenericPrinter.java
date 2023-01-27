package chapter16.generic2;

public class GenericPrinter<M extends Material>{
	
	private M material;
	
	public M getmaterial() {
		return material;
	}
	
	public void setmaterial(M material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	


	

}
