import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class pruebaStreams {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("España");
        paises.add("Francia");
        paises.add("Francia");
        paises.add("Inglaterra");
        paises.add("Estados Unidos");
        paises.add("Alemania");
        paises.add("Bélgica");


        List<String> cll = paises.stream()
                .distinct()
                .sorted()
                .skip(1)
                .filter(pais -> pais.length() > 6)
                .collect(Collectors.toList());
        System.out.println(cll);

        // .forEach(pais -> System.out.println("El país es: " + pais));

    }
}
