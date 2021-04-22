/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Windows 10
 */
public class Juego {
    
    Connection conn = null;
    Statement stm=null;
    ResultSet ResultSet;
    
    public boolean registrarPodio(String nombre, int posicion){
        int resultUpdate = 0;
        
         try{
                  conn = ConexionBD.abrir();
                  stm = conn.createStatement();
                  resultUpdate = stm.executeUpdate("insert into podio(nombre,posicion) values('"+nombre+"',"+posicion+")");
                  
                 if(resultUpdate != 0)
                 {
                       ConexionBD.cerrar();
                       return true;
                 }
                else
                {
                       ConexionBD.cerrar();
                       return false;
                }
         }catch (SQLException e){
                     System.out.println("Error en la base de datos."+e);
                     return false;
                 }
        
    }
}
