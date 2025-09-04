package EjercicioArrayListBBDD.interfacesFuncionalesPrincipales;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Consumer -- Parámetros 1 objeto - Salida void.
        Consumer consumer = (o) -> System.out.println(o);

        // Predicate -- Parámetro 1 objeto - Salida boolean
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                if (o instanceof String) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        Predicate lamdaPredicate = o -> {
            if (o instanceof String) {
                return true;
            } else {
                return false;
            }
        };

        // Supplier -- Sin parámetros - salida 1 objeto.
        // Function -- Parámetro 1 objeto - salida 1 objeto.


    }
}
