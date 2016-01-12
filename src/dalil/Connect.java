package dalil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
     static Connection conn = null;
     
    public static Connection Connect(){
         
     try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost/dbdalil?useUnicode=Yes&characterEncoding=UTF-8","root","123");
            //JOptionPane.showMessageDialog(null, "OK ..");
        }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return conn;
    }
    
}
