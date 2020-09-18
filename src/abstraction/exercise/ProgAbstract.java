package abstraction.exercise;

import abstraction.exercise.entities.Fisica;
import abstraction.exercise.entities.Juridica;
import abstraction.exercise.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgAbstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));
        List<Pessoa> list = new ArrayList<>();
        System.out.print("Entre com o numero de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Contribuinte #" + i + " dados:");
            System.out.print("Individual ou Compania (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i') {
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Despesa com saude: ");
                double despesaSaude = sc.nextDouble();
                list.add(new Fisica(nome,rendaAnual,despesaSaude));
            } else if (ch == 'c') {
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Numero de funcionarios: ");
                double numFuncionarios = sc.nextDouble();
                list.add(new Juridica(nome,rendaAnual,numFuncionarios));
            }
        }
        System.out.println();
        System.out.println("TAXAS PAGAS: ");
        double sum = 0;
        for (Pessoa p:list) {
            System.out.println(String.format("%s: $ %.2f", p.getNome(), p.imposto()));
            sum += p.imposto();
        }
        System.out.println("-------------------------");
        System.out.printf("TOTAL TAXAS: %.2f%n", sum);
        sc.close();
    }
}
