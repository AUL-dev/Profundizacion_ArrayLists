package EjercicioArrayListBBDD.functionalInterfaces.pruebasAlberto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Triangulo {
    private int base;
    private int altura;

    public static void main(String[] args) {
        CalcularAreaTriangulo triangulo = new CalcularAreaTriangulo() {
            @Override
            public int calcularAreaTriangulo(int base, int altura) {
                return base * altura / 2;
            }
        };


        CalcularAreaTriangulo triangulo1 = (base1, altura1) -> base1 * altura1 / 2;

        System.out.println("El área del triángulo standard es de: " + triangulo.calcularAreaTriangulo(20,40));
        System.out.println("El área del triángulo lambda es de: " + triangulo1.calcularAreaTriangulo(20, 40));

    }

    public static int areaTriangulo(Triangulo triangulo) {
        return triangulo.getBase() * triangulo.getAltura() / 2;
    }
}
