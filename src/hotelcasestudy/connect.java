
package hotelcasestudy;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel=new DefaultTableModel();
    String newEmail,newPass,newFname,newLname,newSQ,newSA,s,i,n,u,q,temp_email;
    String newEmail1,newPass1;
    
    public void DoConnect(){
        try{
            String Host ="jdbc:derby://localhost:1527/hotelcasestudy;create=true";
            String uName="APP";
            String uPass="1234";
            con = DriverManager.getConnection(Host, uName,uPass);
            con.setAutoCommit(false);
            stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql="SELECT * FROM USERS";
            rs=stmt.executeQuery(sql);
        }catch (SQLException err) {
            JOptionPane.showMessageDialog(connect.this, err.getMessage());
            
        }
    }
    public void Refresh_RS_STMT(){
        try{
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql ="SELECT * FROM USERS";
            rs = stmt.executeQuery(sql);
        }catch(SQLException ex){
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    
    
}
