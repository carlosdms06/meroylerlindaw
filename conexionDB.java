package paqueteconexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionDB {
   
    Connection conn = null;
    public conexionDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria?serverTimezone=UTC", "root", "root");
            System.out.println("Base de datos conectada...");
        } catch (Exception e) {
            System.out.println("Error...Base de datos no conectada!" + e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conn;
    } 

     
}

