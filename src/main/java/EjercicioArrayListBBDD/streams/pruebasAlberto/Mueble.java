package EjercicioArrayListBBDD.streams.pruebasAlberto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mueble {
    private int anchura;
    private int largura;

    public static void main(String[] args) {
        CrearMueble mueble = new CrearMueble() {
            @Override
            public Mueble crearMueble(int anchura, int largura) {
               Mueble mueble1 = new Mueble();
               mueble1.setAnchura(anchura);
               mueble1.setLargura(largura);
                return mueble1;
            }
        };


        CrearMueble muebleLambda = ((anchura1, largura1) -> new Mueble(anchura1,largura1));

        System.out.println(mueble.crearMueble(20,40));
        System.out.println(muebleLambda.crearMueble(60,80));
    }

}
