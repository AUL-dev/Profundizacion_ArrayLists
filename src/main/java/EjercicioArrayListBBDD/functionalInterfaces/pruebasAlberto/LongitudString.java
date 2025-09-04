package EjercicioArrayListBBDD.functionalInterfaces.pruebasAlberto;

public class LongitudString {
    public static void main(String[] args) {
        CalcularLongitudString longitudTexto = new CalcularLongitudString() {
            @Override
            public int calcularLongitudString(String texto) {
                return texto.length();
            }
        };

        CalcularLongitudString longitudTextoLambda = texto -> texto.length();

        System.out.println("Longitud standard: " + longitudTexto.calcularLongitudString("Hola"));
        System.out.println("Longitud lambda: " + longitudTextoLambda.calcularLongitudString("Hola"));
    }

}
