package generics_principio_get_put;

import java.util.ArrayList;
import java.util.List;

public class ProgramCovariancia {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        //Lista de qualquer tipo que seja subtipo de number
        List<? extends Number> list = intList;

        //GET: É PERMITIDO PEGAR ELEMENTO E ATRIBUIR
        Number x = list.get(0);

        //PUT: NÃO PERMITE ADICIONAR >> Erro de compolição
        //list.add(20);
    }
}
