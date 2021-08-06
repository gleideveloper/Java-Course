package application.pipeline;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class exercResolved {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter full file path: ");
        //String path = sc.nextLine();*/
        String path = "C:\\Workspace\\IdeaProjects\\JavaCourse\\produtos.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String [] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            //pipeline para achar a média dos preços
            double avg =  list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x+y) / list.size();
            System.out.println("Avarage price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            //pipeline para listar em ordem inversa os produtos abaixo da média
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());
            names.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
