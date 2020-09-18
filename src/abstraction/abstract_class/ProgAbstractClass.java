package abstraction.abstract_class;

import abstraction.abstract_class.entities.Account;
import abstraction.abstract_class.entities.SavingsAccount;
import abstraction.abstract_class.entities.BusinessAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgAbstractClass {
    public static void main(String[] args) {
        /**
         * Abstract Class: motivo de uso
         * 1. Reuso
         * 2. Polimorfismo: a superclasse classe genérica nos permite tratar de forma fácil
         * e uniforme todos os tipos de conta.
         * Exemplo: Suponha que você queria:
         * 1. Totalizar o saldo de todas as contas;
         * 2. Depositar 10.00 em todas as contas.
         */
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex",500.0,0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.0,400.00));
        list.add(new SavingsAccount(1003,"Bob",300.0,0.01));
        list.add(new BusinessAccount(1004,"Anna",500.0,500.0));

        double sum = 0;
        for (Account acc:list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc:list) {
            acc.deposit(10.0);
        }
        for (Account acc :list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
