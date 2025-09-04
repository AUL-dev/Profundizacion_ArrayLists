package EjercicioArrayListBBDD.functionalInterfaces.pruebasAlberto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuadrado {
    private int ancho;
    private int largo;

    public static void main(String[] args) {
        CalcularAreaCuadrado cuadrado = new CalcularAreaCuadrado() {
            @Override
            public int calcularAreaCuadrado(int ancho, int largo) {
                return ancho * largo;
            }
        };
        Cuadrado cuadradoStandard = new Cuadrado(20, 40);

        // Párametros
        // Implementación
        CalcularAreaCuadrado cuadarado1 = (ancho, largo) ->  ancho * largo;


        Cuadrado cuadradoLambda = new Cuadrado(40, 80);
        System.out.println("El área del cuadrado standard es de: " + areaCuadrado(cuadradoStandard));
        System.out.println("El área del cuadrado lambda es de: " + areaCuadrado(cuadradoLambda));
    }

    public static int areaCuadrado(Cuadrado cuadrado) {
        return (cuadrado.getAncho() * cuadrado.getLargo());
    }
}
