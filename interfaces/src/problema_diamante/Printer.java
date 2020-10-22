package problema_diamante;

public class Printer extends Device implements IPrinter{

    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
