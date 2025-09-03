package EjercicioArrayListBBDD.devolverIdiomasPaises;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EntityCountryLanguage {
    private String countryCode;
    private String language;
    private boolean isOficial;
    private float percentage;

}
