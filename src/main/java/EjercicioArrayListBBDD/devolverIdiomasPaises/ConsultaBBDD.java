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

    public static void consultaYCreacionArrayCountry(Connection conexion) {
        ArrayList<EntityCountry> array = new ArrayList<>();
        try {
            String sql = "SELECT * FROM COUNTRY";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String codigo = resultSet.getString("Code");
                String nombre = resultSet.getString("Name");
                String continente = resultSet.getString("Continent");
                String region = resultSet.getString("Region");
                float area = resultSet.getFloat("SurfaceArea");
                int anioIndependencia = resultSet.getInt("IndepYear");
                int poblacion = resultSet.getInt("Population");
                float esperanzaVida = resultSet.getFloat("LifeExpectancy");
                float gnp = resultSet.getFloat("GNP");
                float gnpOld = resultSet.getFloat("GNPOld");
                String nombreLocal = resultSet.getString("LocalName");
                String gobierno = resultSet.getString("GovernmentForm");
                String gobernante = resultSet.getString("HeadOfState");
                int capital = resultSet.getInt("Capital");
                String codigo2 = resultSet.getString("Code2");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
