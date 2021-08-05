package application.function;

import entities.Product;
import util_interfaces_funcionais.function.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /* Versões de implementação */
        //1 - Implementação da interface
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //2 - Reference method com método estático
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //3 - Reference method com método não estático
        //List<String> names = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());

        //4 - Expressão lambda declarada
        /*Function<Product, String> func = p->p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());*/

        //5 - Expressão lambda inline
        List<String> names = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
