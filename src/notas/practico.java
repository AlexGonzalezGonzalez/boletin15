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
public class practico {

    double notap,notaPractico;
    String mensaje;

    public void probap() {
        mensaje = JOptionPane.showInputDialog("Introduzca nota de la  prueba practica");
        notap = Float.parseFloat(mensaje);
        while (notap > 10 || notap < 0) {
            JOptionPane.showMessageDialog(null, "Entre 0 y 10");
            notap = Float.parseFloat("Introduzca nota de la prueba practica");
        }
            notaPractico=notap*40/100;
            
        
        
    }
    
}
