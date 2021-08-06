package application.pipeline;

import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class exercFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "C:\\Workspace\\IdeaProjects\\JavaCourse\\emails.txt";
        System.out.print("Enter with salary: ");
        Double sal = sc.nextDouble();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String [] fields = line.split(",");
                list.add(new Funcionario(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            //pipeline para listar em ordem inversa os produtos abaixo da média
            List<String> names = list.stream()
                    .filter(f -> f.getSalary() > sal)
                    //.map(f -> f.getEmail())
                    .map(Funcionario::staticFunctionGetEmail)
                    .sorted(comp)
                    .collect(Collectors.toList());
            names.forEach(System.out::println);

            //pipeline para achar os funcionários são maiores que o informado
            double sum =  list.stream()
                    .filter(f -> f.getName().charAt(0) == 'M')
                    .map(f -> f.getSalary())
                    .reduce(0.0, (x,y) -> x + y) ;
            System.out.println("Salary starts M: " + String.format("%.2f", sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
