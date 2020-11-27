package Map.application;

import Map.entities.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {
    public static void main(String[] args) {

        //usingTreeMap();
        Map<Produto,Double> stock = new HashMap<>();
        Produto p1 =  new Produto("TV", 900.0);
        Produto p2 =  new Produto("Notebook", 1200.0);
        Produto p3 =  new Produto("Tablet", 400.0);
        Produto p4 =  new Produto("Smartphone", 1500.0);

        stock.put(p1,10000.0);
        stock.put(p2,20000.0);
        stock.put(p3,35000.0);
        stock.put(p4,15000.0);

        Produto ps = new Produto("TV", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }

    private static void usingTreeMap() {
        //TreepMap Ordena
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "gleidevelop@gmail.com");
        cookies.put("phone", "98873930");

        cookies.remove("email");
        cookies.put("phone", "09877332");

        System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES");

        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
