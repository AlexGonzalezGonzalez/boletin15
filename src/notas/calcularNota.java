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
public class calcularNota {

    public void calcularNotas(double notaTeorico, double notaPractico, double notaBol) {
        double notaFinal;
        
        
       
        System.out.println(notaTeorico+""+notaPractico+""+notaBol);//valen 0
        notaFinal = notaTeorico + notaPractico+ notaBol;
        JOptionPane.showMessageDialog(null, "Probas Teoricas     " + notaTeorico + "\nProbas Practicas     " + notaPractico + "\nBoletins     " + notaBol + "\nNota Total   " + notaFinal);

    }
}
