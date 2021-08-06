package application;

import entities.Product;
import util_interfaces_funcionais.comparator.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
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

        /* 1º forma passando um comparator
        list.sort(new MyComparator()); */

        /* 2º forma passando uma class anômima
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        /* 3º forma passando uma expressao Lambda[Arow Function] e definindo um função anômima
        Comparator<Product> comp = (p1, p2) -> {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };*/

        /* 4º forma passando uma expressao Lambda[Arrow Function] e definindo um função anômima */
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
