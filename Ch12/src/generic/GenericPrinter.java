package generic;

public class GenericPrinter<T extends Material> {	//<T>: ?†ú?Ñ§Î¶? ?Å¥?ûò?ä§
	private T material;	
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
