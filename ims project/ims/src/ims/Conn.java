package ims;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conn {
     public static Connection conLink(){
        Connection con=null;
        try{    
         Class.forName("oracle.jdbc.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ims","rays");
         }
         catch(Exception e){
           JOptionPane.showMessageDialog(null,"Hello","connection problem",JOptionPane.ERROR_MESSAGE);
         }    
        return(con);
    }        
}
