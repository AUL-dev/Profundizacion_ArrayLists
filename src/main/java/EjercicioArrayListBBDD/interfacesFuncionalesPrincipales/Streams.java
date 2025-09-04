package EjercicioArrayListBBDD.interfacesFuncionalesPrincipales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        ArrayList<String> listaCompra = new ArrayList<>();

        listaCompra.add("Queso");
        listaCompra.add("Patatas");
        listaCompra.add("Patatas");
        listaCompra.add("Queso");
        listaCompra.add("Patatas");


        List<String> listaFiltrada =
                listaCompra.stream().distinct().collect(Collectors.toList());

        listaFiltrada.forEach(o -> System.out.println(o));

        /*
        boolean b = listaCompra
                .stream()
                .filter(s ->s.equals(s))
                .allMatch(reciboCompra -> reciboCompra.equals("Patatas") || reciboCompra.equals("Queso");

         */


        // System.out.println("Qué cantidad de patatas hay: "+patatas1);


    }
}
