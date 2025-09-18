import java.util.ArrayList;

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

        paises.stream()
                .distinct()
                .sorted()
                .skip(1)
                .forEach(pais -> System.out.println("El país es: " + pais));

    }
}
