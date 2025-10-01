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
                int idCiudad = resultSet.getInt("Id");
                String nombre = resultSet.getString("Name");
                String codigoPais = resultSet.getString("CountryCode");
                String distrito = resultSet.getString("District");
                int poblacion = resultSet.getInt("Population");
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
                    " El nombre de la ciudad es: " + nombre + " El código del país es: "
                    + codigoPais + " El distrito es: " + distrito
                    + " La población es de : " + poblacion);
        }
    }

    public static void actualiza(ArrayList<EntityCity> datosCiudad, int posicion, int idCiudad, String nombre, String codigoPais, String distrito, int poblacion) {
        datosCiudad.get(posicion).setIdCiudad(idCiudad);
        datosCiudad.get(posicion).setNombre(nombre);
        datosCiudad.get(posicion).setCodigoPais(codigoPais);
        datosCiudad.get(posicion).setDistrito(distrito);
        datosCiudad.get(posicion).setPoblacion(poblacion);
        leerTodos(datosCiudad);
    }

    public static void elimina(ArrayList<EntityCity> datosCiudades, int posicion) {
        datosCiudades.remove(posicion);
        leerTodos(datosCiudades);
    }
}
