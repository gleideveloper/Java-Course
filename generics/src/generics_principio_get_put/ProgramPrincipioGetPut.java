package generics_principio_get_put;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProgramPrincipioGetPut {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printMyList(myObjs);

        copy(myDoubles, myObjs);
        printMyList(myObjs);
    }

    private static void copy(List<? extends Number> source, List<? super Number> target) {
        for (Number n : source) {
            target.add(n);
        }
    }

    private static void printMyList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
