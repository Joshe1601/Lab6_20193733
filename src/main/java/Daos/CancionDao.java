package Daos;

import Beans.Reproduccion;
import Beans.Tour;

import java.sql.*;
import java.util.ArrayList;

public class CancionDao {

    private static String user = "root";
    private static String pass = "123456";
    private static String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";


    public ArrayList<Reproduccion> obtenerListaCanciones(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query =  "SELECT c.idcancion, c.nombre_cancion AS nombre_cancion, b.idbanda AS nombre_banda\n" +
                        "FROM banda b\n" +
                        "JOIN cancion c ON b.idbanda = c.banda\n" +
                        "ORDER BY b.idbanda;";

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

        } catch (SQLException throwables) {
            System.out.println("No se pudo realizar la busqueda");
            throwables.printStackTrace();
        }
        return listaCanciones;
    }




}
