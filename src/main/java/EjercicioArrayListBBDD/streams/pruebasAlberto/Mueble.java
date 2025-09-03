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
            public Mueble crearmueble(int anchura, int largura) {
                Mueble mueble2 = new Mueble();
                mueble2.setAnchura(anchura);
                mueble2.setLargura(largura);
                return mueble2;
            }
        };


        CrearMueble muebleLambda = ((anchura1, largura1) -> new Mueble(anchura1,largura1));

        System.out.println(mueble.crearmueble(20,40));
        System.out.println(muebleLambda.crearmueble(60,80));
    }

}
