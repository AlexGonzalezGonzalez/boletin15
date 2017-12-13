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
public class teorico {

    double nota1, nota2, mediat,notaTeorico;
    String mensaje,erro="Nota no valida";

    public void notaTeorico() {
        mensaje = JOptionPane.showInputDialog("Introduzca nota de la 1º prueba Toerica");
        nota1 = Float.parseFloat(mensaje);
        while (nota1 > 10.0 || nota1 < 0.0) {
            JOptionPane.showInputDialog(erro);
             nota1 = Float.parseFloat(erro);
        }
        mensaje = JOptionPane.showInputDialog("Introduzca nota de la 2º prueba Toerica");
        nota2 = Float.parseFloat(mensaje);
        while (nota2 > 10 || nota2 < 0) {
            JOptionPane.showInputDialog(erro);

            nota2 = Float.parseFloat(erro);
        }
        mediat = (nota1 + nota2) / 2;
        notaTeorico=mediat*40/100;
       
    }
}
