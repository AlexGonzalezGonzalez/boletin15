/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author agonzalezgonzalez
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularNota cn = new calcularNota();
        teorico t=new teorico();
        practico p= new practico();
        boletines b= new boletines();
        t.notaTeorico();
        p.probap();
        b.notaBoletin();
        cn.calcularNotas(t.notaTeorico, p.notaPractico, b.notaBol);

    }

}
