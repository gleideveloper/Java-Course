package generics_principio_get_put;

import java.util.ArrayList;
import java.util.List;

public class ProgramContravariancia {
    public static void main(String[] args) {
        List<Object> myObjts = new ArrayList<>();
        myObjts.add("Maria");
        myObjts.add("Alex");

        //Lista de qualquer tipo SUPER de number
        List<? super Number> myNumbers = myObjts;

        //PUT: É PERMITIDO ADICIONAR
        myNumbers.add(10);
        myNumbers.add(3.14);

        //GET: NÃO É PERMITIDO PEGAR ELEMENTO E ATRIBUIR
        //Number x = myNumbers.get(0);
    }
}
