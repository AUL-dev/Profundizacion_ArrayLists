package EjercicioArrayListBBDD.streams.pruebasAlberto;

public class Coche {

    public static void main(String[] args) {
        Vehiculo coche = (km) -> System.out.println("El coche está acelerando " + km + " versión lambda.");

        Vehiculo coche2 = new Vehiculo() {
            @Override
            public void acelerar(int km) {
                System.out.println("El coche está acelerando " + km + " versión standard.");
            }
        };
        coche2.acelerar(50);
        coche.acelerar(75);
    }
}
