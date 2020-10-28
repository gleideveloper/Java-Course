package default_methods.application;

import default_methods.services.BrazilInterestService;
import default_methods.services.InterestService;
import default_methods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDefaultMethods {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        //Sem interface
        //BrazilInterestService is = new BrazilInterestService(2.0);

        //Com interface
        //InterestService is = new BrazilInterestService(2.0);
        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
