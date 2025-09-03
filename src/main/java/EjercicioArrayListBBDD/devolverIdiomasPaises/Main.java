package EjercicioArrayListBBDD.devolverIdiomasPaises;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static ArrayList<EntityCountryLanguage> devolverPaises() {
        Connection conexion = ConexionMundo.abrirConexion();
        ArrayList<EntityCountryLanguage> entityCountryLanguages = ConsultaBBDD.consultaYCreacionArrayList(conexion);
        ConexionMundo.cerrarConexion(conexion);
        return entityCountryLanguages;
    }
}
