package bbangjun.do_it_java.ch12;

public class P394_GenericPrinterTest {
    public static void main(String[] args) {
        P393_GenericPrinter <P392_Powder> powderPrinter = new P393_GenericPrinter<P392_Powder>(); // Powder형으로 GenericPrinter 클래스 생성

        powderPrinter.setMaterial(new P392_Powder());
        P392_Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        P393_GenericPrinter<P393_Plastic> plasticPrinter = new P393_GenericPrinter<P393_Plastic>();

        plasticPrinter.setMaterial(new P393_Plastic());
        P393_Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
