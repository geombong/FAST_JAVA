package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter.toString());

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter.toString());

        plasticPrinter.printing();
        powderPrinter.printing();
    }
}
