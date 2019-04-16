import java.sql.*;
import javax.swing.JOptionPane;

public class dbcon {
    Connection conn;
    public static Connection connectdb()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/radio stations1","root","");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
