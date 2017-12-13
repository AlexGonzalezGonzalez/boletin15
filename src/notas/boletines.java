/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class boletines {

    //numero boletines=17.
    //boletines incompletos pues estan incompletos gg wp.
//    Máis  do 90 % do total  2 puntos 
//    Entre o 70% e o 90% ( ambos os dous incluidos )  1 punto
//    Menos do 70 %  - 0 puntos .
    int numBoletines;
    double notab,notaBol;
    String mensaje;

    public void notaBoletin() {
        //90%=16-17 boletines son 2 puntos, 70% 12-15 boletines 1 punto
        mensaje = JOptionPane.showInputDialog("Introduzca boletines completos");
        numBoletines = Integer.parseInt(mensaje);
        if (numBoletines >= 16) {
            notab = 2.0;
        } else if (numBoletines <= 15 && numBoletines >= 12) {
            notab = 1.0;
        } else {
            notab = 0.0;
        }
        notaBol=notab;
    }
    
}
