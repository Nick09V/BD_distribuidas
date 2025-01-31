package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // Reemplaza con tu SID si es diferente
    private static final String USUARIO = "nvalverde"; // Reemplaza con tu usuario de Oracle
    private static final String PASSWORD = "nvalverde"; // Reemplaza con tu contraseña

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa a Oracle DB");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
