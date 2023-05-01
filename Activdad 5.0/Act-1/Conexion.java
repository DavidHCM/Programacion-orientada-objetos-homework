
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela1","root","123456");
        } catch (Exception e) {
            System.err.println(e);
        }        
    }
    public Connection getConnection(){
        return con;
    }

    public ResultSet find(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  }
