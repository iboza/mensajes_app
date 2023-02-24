package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app?serverTimezone=UTC", "root", "");

        }catch(SQLException e){
            System.out.println("Error en conexión!! " + e);
        }
        return conection;
    }
}