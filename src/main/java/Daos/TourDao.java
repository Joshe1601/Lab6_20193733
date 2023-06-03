package Daos;

import Beans.Tour;

import java.sql.*;
import java.util.ArrayList;

public class TourDao {


    public ArrayList<Tour> obtenerListaTours(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Tour> listaTours = new ArrayList<>();
        String user = "root";
        String pass = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/lab6sw1";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from tour")) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String banda = rs.getString(3);

                listaTours.add(new Tour(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaTours;
    }




}
