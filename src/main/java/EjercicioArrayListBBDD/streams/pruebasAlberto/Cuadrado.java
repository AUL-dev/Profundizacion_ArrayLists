package EjercicioArrayListBBDD.streams.pruebasAlberto;

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
            public Cuadrado calcularAreaCuadrado(int ancho, int largo) {
                Cuadrado cuadrado2 = new Cuadrado();
                cuadrado2.setAncho(ancho);
                cuadrado2.setLargo(largo);
                return cuadrado2;
            }
        };
        Cuadrado cuadradoStandard = new Cuadrado(20, 40);

        CalcularAreaCuadrado cuadrado1 = ((ancho1, largo1) -> new Cuadrado(ancho1, largo1));

        Cuadrado cuadradoLambda = new Cuadrado(40, 80);
        System.out.println("El área del cuadrado standard es de: " + areaCuadrado(cuadradoStandard));
        System.out.println("El área del cuadrado lambda es de: " + areaCuadrado(cuadradoLambda));
    }

    public static int areaCuadrado(Cuadrado cuadrado) {
        return (cuadrado.getAncho() * cuadrado.getLargo());
    }
}
