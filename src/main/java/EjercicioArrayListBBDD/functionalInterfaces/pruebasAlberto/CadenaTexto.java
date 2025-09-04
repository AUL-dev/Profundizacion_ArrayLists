package EjercicioArrayListBBDD.functionalInterfaces.pruebasAlberto;

public class CadenaTexto {
    public static void main(String[] args) {
        CadenaString cadenaString = new CadenaString() {
            @Override
            public String cadenaString(String texto, String texto2, String texto3) {
                System.out.println("Primer texto: " + texto);
                System.out.println("Segundo texto: " + texto2);
                System.out.println("Tercer texto: " + texto3);
                return texto + " " + texto2 + " " + texto3;
            }
        };

        CadenaString cadenaStringLambda = (texto, texto2, texto3) -> {
            System.out.println("Primer texto: " + texto);
            System.out.println("Segundo texto: " + texto2);
            System.out.println("Tercer texto: " + texto3);
            return texto + " " + texto2 + " " + texto3;
        };
        System.out.println(cadenaString.cadenaString("Hola", "Caracola", " Canibal"));
        System.out.println(cadenaStringLambda.cadenaString("Hola", "Caracola", " Canibal"));

    }
}
