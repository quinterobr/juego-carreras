package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
    static private Connection con;
public static Connection abrir(){
    try

    {
        
    Class.forName("com.mysql.jdbc.Driver");
    String url= "jdbc:mysql://localhost:3306/pruebas";
    con = DriverManager.getConnection(url,"root","");
 
    }catch (ClassNotFoundException | SQLException e)
    {
    
        System.out.println("Error en la conexion..." + e);
   
    }
    
return con;

}

public static void cerrar(){
try
    {
   if(con != null)
        con.close();
    }catch (SQLException e)
    {
      System.out.println("Error: No se logro cerrar conexion:\n"+e);
    }
}

}
