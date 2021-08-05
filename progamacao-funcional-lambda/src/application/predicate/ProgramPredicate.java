package application.predicate;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramPredicate {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /* Versões de implementação */
        //1 - Implementação da interface
        //list.removeIf(new ProductPredicate());

        //2 - Reference method com método estático
        //list.removeIf(Product::staticProdPredicate);

        //3 - Reference method com método não estático
        //list.removeIf(Product::noStaticProdPredicate);

        //4 - Expressão lambda declarada
        //Predicate<Product> pred = p->p.getPrice() >= 100;
        //list.removeIf(pred);

        //5 - Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
