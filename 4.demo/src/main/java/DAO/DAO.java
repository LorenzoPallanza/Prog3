package DAO;

import java.sql.*;
import java.util.ArrayList;

public class DAO {

    private static final String url1 = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "";

   /* public DAO(String url, String user, String pwd) {
        url1 = url;
        this.user = user;
        password = pwd;
        registerDriver();
    }*/

    private void registerDriver() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            System.out.println("Driver correttamente registrato");
        } catch (SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static ArrayList<Persona> queryDB() {
        Connection conn1 = null;
        ArrayList<Persona> out = new ArrayList<>();
        try {
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test");
            }

            Statement st = conn1.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM STUDENTE");
            while (rs.next()) {
                Persona p = new Persona(rs.getString("NOME"), rs.getString("COGNOME"), rs.getString("MATRICOLA"));
                out.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return out;
    }
}
