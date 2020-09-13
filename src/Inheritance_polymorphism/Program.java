package Inheritance_polymorphism;

import Inheritance_polymorphism.entities.Account;
import Inheritance_polymorphism.entities.BusinessAccount;
import Inheritance_polymorphism.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        progrPolimorfismo();
        /*progHeranca();
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
}
