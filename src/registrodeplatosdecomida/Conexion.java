/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeplatosdecomida;


import java.sql.DriverManager;
import java .sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Conexion {
    Connection conexion=null;
    String url="jdbc:mysql://localhost:3307/registro";
    String usuario="root";
    String contraseña="contraseña";
        
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion= DriverManager.getConnection(url,usuario,contraseña);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return conexion;
    }
}
