package EjercicioArrayListBBDD.functionalInterfaces.pruebasIsam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pastel {
    private String nombrePastel;


    public static void main(String[] args) {


        CrearPastel cp = new CrearPastel() {
            @Override
            public Pastel crearPastel(String nombrePastel) {
                Pastel ps = new Pastel();
                ps.setNombrePastel(nombrePastel);
                return ps;
            }
        };

        CrearPastel cpLambda = (nombrePastel) -> new Pastel(nombrePastel);

        System.out.println(cp.crearPastel("Tarta de queso"));
        System.out.println(cpLambda.crearPastel("Tarta de arándanos"));



    }
}
