package EjercicioArrayListBBDD.streams.pruebasAlberto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Triangulo {
    private int base;
    private int altura;

    public static void main(String[] args) {
        CalcularAreaTriangulo triangulo = new CalcularAreaTriangulo() {
            @Override
            public Triangulo calcularAreaTriangulo(int base, int altura) {
                Triangulo triangulo = new Triangulo();
                triangulo.setBase(base);
                triangulo.setAltura(altura);
                return triangulo;
            }
        };
        Triangulo trianguloStandard = new Triangulo(20, 50);

        CalcularAreaTriangulo triangulo1 = ((base1, altura1) -> new Triangulo(base1, altura1));
        Triangulo trianguloLambda = new Triangulo(30, 90);

        System.out.println("El área del triángulo standard es de: " + areaTriangulo(trianguloStandard));
        System.out.println("El área del triángulo lambda es de: " + areaTriangulo(trianguloLambda));

    }

    public static int areaTriangulo(Triangulo triangulo) {
        return triangulo.getBase() * triangulo.getAltura() / 2;
    }
}
