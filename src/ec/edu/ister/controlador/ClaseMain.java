/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;
 
import ec.edu.ister.modelo.AgreloEnteros;
import ec.edu.ister.modelo.Arreglos;
import ec.edu.ister.vista.FrmLogin;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */

public class ClaseMain {
    public static void main(String[] args) {
        FrmLogin OB_Formulario = new FrmLogin();
        OB_Formulario.setVisible(true);
        /*AgreloEnteros a = new AgreloEnteros();
        a.randomicos();
        System.out.println("Respuesta suma "+a.suma());
        System.out.println("Respuesta de promedio es "+a.promedio());
        System.out.println("Respuesta de max es "+a.max());
        System.out.println("Respuesta de min es "+a.min());
        */
    }
}
