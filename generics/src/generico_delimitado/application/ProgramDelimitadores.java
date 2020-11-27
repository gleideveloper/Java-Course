package generico_delimitado.application;

import generico_delimitado.entities.Product;
import generico_delimitado.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramDelimitadores {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "Generics/src/generico_delimitado/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                //System.out.println(line);
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("**** Most expensive ****");
            System.out.println(x);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
