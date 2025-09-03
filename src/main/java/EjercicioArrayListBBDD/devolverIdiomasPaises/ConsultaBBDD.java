package EjercicioArrayListBBDD.devolverIdiomasPaises;

import java.sql.*;
import java.util.ArrayList;

public class ConsultaBBDD {

    public static ArrayList<EntityCountryLanguage> consultaYCreacionArrayList(Connection conexion) {
        ArrayList<EntityCountryLanguage> array = new ArrayList<>();
        try {
            String sql = "SELECT * FROM COUNTRYLANGUAGE";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String codigoPais = resultSet.getString("Countrycode");
                String lenguaje = resultSet.getString("Language");
                boolean esOficial = resultSet.getBoolean("Isofficial");
                float porcentaje = resultSet.getFloat("Percentage");
                EntityCountryLanguage pais = new EntityCountryLanguage(codigoPais, lenguaje, esOficial, porcentaje);
                array.add(pais);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return array;
    }
}
