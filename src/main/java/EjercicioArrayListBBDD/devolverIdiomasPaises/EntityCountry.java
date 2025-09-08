package EjercicioArrayListBBDD.devolverIdiomasPaises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityCountry {
    private String codigo;
    private String nombre;
    private String continente;
    private String region;
    private float area;
    private int anioIndependencia;
    private int poblacion;
    private float esperanzaVida;
    private float gnp;
    private float gnpOld;
    private String nombreLocal;
    private String formaGobierno;
    private String gobernante;
    private int capital;
    private String codigo2;
}
