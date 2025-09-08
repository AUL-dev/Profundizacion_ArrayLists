package EjercicioArrayListBBDD.ProbandoStreams;

import EjercicioArrayListBBDD.devolverIdiomasPaises.ConexionMundo;
import EjercicioArrayListBBDD.devolverIdiomasPaises.ConsultaBBDD;
import EjercicioArrayListBBDD.devolverIdiomasPaises.EntityCountryLanguage;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Connection conexion = ConexionMundo.abrirConexion();
        ArrayList<EntityCountryLanguage> entityCountryLanguages = ConsultaBBDD.consultaYCreacionArrayList(conexion);

        //arrayCodigoPais(entityCountryLanguages);
        //numeroVecesRepetidasPais(entityCountryLanguages);
        mapearCountryCode(entityCountryLanguages);


    }

    public static void arrayCodigoPais(ArrayList<EntityCountryLanguage> entityCountryLanguages) {

        // En este metodo rellenaremos un arraylist con los países de la tabla COUNTRYLANGUAGE, sin repetirlos

        ArrayList<String> arrayCountryCode = new ArrayList<>();

        for (EntityCountryLanguage entityCountryLanguage : entityCountryLanguages) {

            String countryCode2 = entityCountryLanguage.getCountryCode();
            if (!arrayCountryCode.contains(countryCode2)) {
                arrayCountryCode.add(countryCode2);
            }
        }

        for (String codigoPais : arrayCountryCode) {
            System.out.println(codigoPais);
        }

        System.out.println("Número de código de países: " + arrayCountryCode.size());
    }

    public static void numeroVecesRepetidasPais(ArrayList<EntityCountryLanguage> entityCountryLanguages) {
        int numRepeticiones = 0;
        for (EntityCountryLanguage recorrerArray : entityCountryLanguages) {
            if (recorrerArray.getCountryCode().equals("ESP")) {
                numRepeticiones++;
            }
        }
        System.out.println("El número de repeticones de España es de: " + numRepeticiones);
    }

    public static void mapearCountryCode(ArrayList<EntityCountryLanguage> entityCountryLanguages) {
        //DONDE EL IDIOMA OFICIAL SEA TRUE
        Map<String, Boolean> countryTrue = new HashMap<>();
        for (EntityCountryLanguage recorrer : entityCountryLanguages) {
            boolean oficial = recorrer.isOficial();
            String codigoPais = recorrer.getCountryCode();
            if (oficial) {
                countryTrue.put(codigoPais, true);
            }
        }
        System.out.println(countryTrue);

    }

    // Sacame los paises con un porcentaje mayor a 40 en un arraylist, y menor en otro.

    // Creame un arraylist nuevo con los paises (tabla country) que su año de indepencia sea mayor a 1985
    // y que la esperanza de vida sea menor a 75

    // Hazme un arraylist de las ciudades que tengan una población más de 150.000 y además, el nombre de la ciudad
    // contenga una k.
}

