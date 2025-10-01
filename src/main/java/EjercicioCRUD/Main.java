package EjercicioCRUD;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Connection conexion = ConexionCiudad.abrirConexion();
        ArrayList<EntityCity> creacionArray = ConsultaBBDD.creacion(conexion);
        // ConsultaBBDD.leerTodos(creacionArray);
        //ConsultaBBDD.actualiza(creacionArray, 4078, 4079, "Rufus", "RUF", "Rufus", 32);
        //ConsultaBBDD.elimina(creacionArray,4078);

        creacionArray.stream()
                .distinct()
                .filter(pais -> pais.getPoblacion() > 1000000 && pais.getNombre().length() > 7 && pais.getNombre().charAt(0) == 'V')
                .forEach(pais -> System.out.println("El país es: " + pais));
    }
}
