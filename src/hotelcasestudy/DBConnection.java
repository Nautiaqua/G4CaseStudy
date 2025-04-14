/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelcasestudy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WINDOWS
 */
public class DBConnection {
    private static final String DRIVER ="org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL ="jdbc:derby:hotelcasestudy;create=true";
    
    Connection conn;
    
    public DBConnection() {
        try {
            this.conn = DriverManager.getConnection(JDBC_URL);
            if (this.conn != null) {
                System.out.println("Connected to database successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
