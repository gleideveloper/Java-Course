package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramFuncional {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Smartphone", 1500.0));
        list.add(new Product("Abacaxi", 100.0));
        list.add(new Product("Xadrez", 2500.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Banana", 10.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
