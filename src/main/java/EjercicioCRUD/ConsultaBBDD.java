package EjercicioCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaBBDD {
    public static ArrayList<EntityCity> creacion(Connection conexion) {
        ArrayList<EntityCity> datosCiudadades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CITY";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idCiudad = resultSet.getInt("Id_Ciudad");
                String nombre = resultSet.getString("Nombre");
                String codigoPais = resultSet.getString("Codigo_Pais");
                String distrito = resultSet.getString("Distrito");
                int poblacion = resultSet.getInt("Poblacion");
                EntityCity entityCity = new EntityCity(idCiudad, nombre, codigoPais, distrito, poblacion);
                datosCiudadades.add(entityCity);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return datosCiudadades;
    }

    public static void leerTodos(ArrayList<EntityCity> datosCiudad) {

            for (EntityCity entityCity : datosCiudad) {
                int idCiudad = entityCity.getIdCiudad();
                String nombre = entityCity.getNombre();
                String codigoPais = entityCity.getCodigoPais();
                String distrito = entityCity.getDistrito();
                int poblacion = entityCity.getPoblacion();
                System.out.println("El id de la ciudad es: " + idCiudad +
                        "El nombre de la ciudad es: " + nombre + "El código del país es: "
                        + codigoPais + "El distrito es: " + distrito
                        + "La población es de : " + poblacion);
            }
    }
    public static void actualiza(ArrayList<EntityCity> datosCiudades) {
        EntityCity entityCity = datosCiudades.get(1);
    }
}
