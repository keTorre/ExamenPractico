package ec.edu.ister.modelo;

import javax.swing.JOptionPane;
import java.util.*;
/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {

    static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    static String array[] = null;
    public static String[] mesesAnio() {
        return meses;
    }
    public static String[] diasSemana() {
        return dias;
    }   
   
    public static String[] randomicos() {
        array = new String[Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de números randómicos"))];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(Math.random() * 5);   
        }
        
        return array;
    }
    public static String suma( ){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); 
        }
        return "";  
    }
     public static String max(){
         int comparador = 0;
         for (int i = 0; i < array.length; i++) {
             if ( comparador > Integer.parseInt(array[i]) ) {
                 comparador = Integer.parseInt(array[i]);
             } 
         }
         System.out.println( comparador );
         return "";
     }
}
