/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bd_distribuidas;

import controller.Conexion;

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
    }
    
}
