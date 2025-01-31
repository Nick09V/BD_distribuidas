/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bd_distribuidas;

import controller.Conexion;
import controller.ControladorPrincipal;
import view.VistaPrin;

/**
 *
 * @author nickv
 */
public class BD_distribuidas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conexion conn = new Conexion();
       conn.conectar();
       
        VistaPrin vista = new VistaPrin();
        ControladorPrincipal controlador = new ControladorPrincipal(vista);
        vista.setVisible(true);
    }
    
}
