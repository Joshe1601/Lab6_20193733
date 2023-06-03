package Daos;

import Beans.Reproduccion;
import Beans.Tour;

import java.sql.*;
import java.util.ArrayList;

public class RecomendadoDao {

    private static String user = "root";
    private static String pass = "123456";
    private static String url = "jdbc:mysql://127.0.0.1:3306/lab6sw1";


    public ArrayList<Reproduccion> obtenerListaReproducciones(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query = "SELECT c.idcancion, c.nombre_cancion AS nombre_cancion, b.nombre_banda AS nombre_banda " +
                "FROM reproduccion r " +
                "JOIN cancion c ON r.cancion_idcancion = c.idcancion " +
                "JOIN banda b ON c.banda = b.idbanda " +
                "GROUP BY c.idcancion " +
                "HAVING COUNT(*) > 2 " +
                "ORDER BY COUNT(*) DESC";

        ArrayList<Reproduccion> listaCanciones = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String banda = rs.getString(3);

                listaCanciones.add(new Reproduccion(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaCanciones;
    }




}
