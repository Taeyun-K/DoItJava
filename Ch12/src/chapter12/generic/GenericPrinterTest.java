package chapter12.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic> ();
		
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
	}

}
