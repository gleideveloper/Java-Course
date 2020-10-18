package exercicio_de_fixacao.app;

import exercicio_de_fixacao.model.entities.Contract;
import exercicio_de_fixacao.model.entities.Installment;
import exercicio_de_fixacao.model.services.ContractService;
import exercicio_de_fixacao.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgExercicioInterfaces {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int nInstallments = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, nInstallments);

        System.out.println("Installments:" );
        for (Installment it : contract.getInstallments()) {
            System.out.println(it);
        }

        sc.close();
    }
}
