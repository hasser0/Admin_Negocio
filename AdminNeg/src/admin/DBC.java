package admin;
import javax.swing.*;
import java.sql.*;
public class DBC {
    
    //Instance from java.sql
    private static Connection con;
    //Instance to use singleton 
    private static DBC instance;
    
    //Variables to access db
    private static final String URL = "jdbc:mysql://localhost/db_admin";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    //private constructor
    private DBC(){
        
    }
    //establish connection
    public Connection open(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);   
            
        }catch(Exception e){
            
            javax.swing.JOptionPane.showMessageDialog(null,"Error: "+ e);
        }finally{
            return con;
        }
    }
    //close connection
    public void close() throws SQLException{
        try{
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+ e);
            con.close();
        }finally{
            con.close();
        }
    }
    public static DBC getInstance(){
        if(instance == null){
            instance = new DBC();
        }
        return instance;
    }
}
