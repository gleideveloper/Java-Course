package problema_diamante;

public class ProgramDiamante {

    public static void main(String[] args) {
        Printer p = new Printer("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();

        Scanner sc = new Scanner("2003");
        sc.processDoc("My Email");
        System.out.println("Scanner Result: " + sc.scan());

        System.out.println();

        ComboDevice cd = new ComboDevice("2001");
        cd.processDoc("My dissertation");
        cd.print("My dissertation");
        System.out.println("Scan result: " + cd.scan());
    }
}
