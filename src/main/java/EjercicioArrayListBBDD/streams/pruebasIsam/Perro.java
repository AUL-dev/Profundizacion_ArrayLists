package EjercicioArrayListBBDD.streams.pruebasIsam;

public class Perro {

    public static void main(String[] args) {
        Animal perro = new Animal() {

            // No devuelve nada
            // No tiene parámetros.
            @Override
            public void onomatopeya() {
                System.out.println("Roff...");
            }
        };

        // No tiene parámetros
        // Imprime
        Animal perro1 = () -> System.out.println("Roff...");

        perro.onomatopeya();
        perro1.onomatopeya();
    }
}
