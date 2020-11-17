package application;

import entities.Produto;

import java.util.*;

public class ProgramSet {
    public static void main(String[] args) {
        /*hashSet();
        treeSet();
        linkedHashSet();
        conjuntoSet();*/

        Set<Produto> set = new HashSet<>();

        set.add(new Produto("TV",900.0));
        set.add(new Produto("Notebook",1200.0));
        set.add(new Produto("Tablet",400.0));

        Produto prod =new Produto("Notebook",1200.0);
        System.out.println(set.contains(prod));
    }

    public static void conjuntoSet() {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }

    public static void hashSet() {
        //HashSet -> é o mais rapido de todos, mas não mantem a ordem
        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("***** HashSet *****\n");
    }

    public static void treeSet(){
        Set<String> set = new TreeSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String str: set) {
            System.out.println(str);
        }
        System.out.println("***** TreeSet *****\n");
    }

    public static void linkedHashSet(){
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //System.out.println(set.contains("Notebook"));
        //System.out.println(set.remove("Notebook"));
        //System.out.println(set.removeIf(x -> x.length() >= 3));
        System.out.println(set.removeIf(x -> x.charAt(0) == 'T'));

        for (String str: set) {
            System.out.println(str);
        }
        System.out.println("***** LinkedHasSet *****\n");
    }
}
