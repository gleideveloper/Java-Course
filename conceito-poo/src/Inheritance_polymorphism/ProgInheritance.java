package Inheritance_polymorphism;

import Inheritance_polymorphism.entities.Account;
import Inheritance_polymorphism.entities.BusinessAccount;
import Inheritance_polymorphism.entities.SavingsAccount;
import Inheritance_polymorphism.exercise.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgInheritance {

    public static void main(String[] args) throws ParseException {
        exerciseFixation();
        /*exercisePolimorfismo();
        progrPolimorfismo();
        progHeranca();
        progSobreCarga();*/
    }

    /**
     * Sobrecarga ou Sobreposição: É a implementação do método da superclasse no método da subclasse.
     */
    public static void progSobreCarga(){

        Account account = new Account(1001, "Alex", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account1 = new SavingsAccount(1002,"Maria", 1000.0, 0.01);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());
    }
    /**
     * Herança: É um tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra
     * Tem uma Relação "é-um"
     * Generalização/Especialização
     */
    public static void progHeranca() {
        Account account = new Account(1011, "Alex",0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria",0.0, 500.0);

        /**
         * UPCASTING
         */
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004,"Anna",0.0, 0.01);

        /**
         * DOWNCASTING
         */
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);
        //BusinessAccount account5 = (BusinessAccount) account3;
        if (account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }
        if (account3 instanceof SavingsAccount){
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }
    }
    /**
     * Herança: É um recurso que permite que variáveis do mesmo tipo mais genérico possam apontar para
     * objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo especifíco.
     * UPCASTING: Associação do tipo específico com o tipo genérico é feita em tempo de execução.
     * Compilador: Não sabe para qual tipo ESPECÍFICO (Instância) a chamada do método Withdraw está sendo feita,
     * ele só sabe que são duas variáveis do tipo GENÉRICO (Account).
     */

    public static void progrPolimorfismo() {
        Account x = new Account(1020, "Alex",1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println("Account: "+ x.getBalance());
        System.out.println("SavingsAccount: "+ y.getBalance());
    }

    public static void exercisePolimorfismo(){
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner((System.in));
        List<Employee> list = new ArrayList<>();
        System.out.print("Enter with number Employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additinalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee(name,hours,valuePerHour,additinalCharge));
            }else{
                list.add(new Employee(name, hours,valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp:list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }

    public static void exerciseFixation() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'c') {
                list.add(new Product(name, price));
            }else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
