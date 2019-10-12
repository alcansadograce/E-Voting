package evotingsystem.Student;
import java.sql.*;

public final class DatabaseConnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost:3307/dbms";
    String user = "root";
    String password="Grace22";
    
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    
     public DatabaseConnection(){
                openDatabase();
        }
    public void openDatabase()
    {
        try
        {   
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(DB_URL,user,password);	            
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            if(!conn.isClosed())
            {
                System.out.print("Database Connection Successful!");
                             
            }
        }
        catch(ClassNotFoundException | SQLException e)
                {
                     System.out.print(e);
                }
    
    }
    //
    
    public static void main(String[] args) {
        
        DatabaseConnection connection = new DatabaseConnection();
        
    }
}