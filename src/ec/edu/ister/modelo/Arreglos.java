package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {

    static String meses[]= {"enero","febrero","marzo","abril",
        "mayo","junio","julio","agosto","septiembre",
        "octubre","noviembre","diciembre"};
    static String dias[]={"lunes","martes","miercoles","jueves","viernes","sábado","domingo"};
   public static String[] mesesAnio(){
       return meses;
   } 
    
    public static String[] diasSemana(){
        return dias;
    }

public static String[] randomicos(){
    String array[]= new String[Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos randómicos"))];
    for (int i = 0; i < array.length; i++) {
        array[i]=String.valueOf(Math.random()*100);
    }
    return array;
}    
    

}








