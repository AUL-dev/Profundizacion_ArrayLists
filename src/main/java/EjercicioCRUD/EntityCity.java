package EjercicioCRUD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityCity {
    private int idCiudad;
    private String nombre;
    private String codigoPais;
    private String distrito;
    private int poblacion;
}
