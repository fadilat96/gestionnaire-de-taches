/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

public class Devinette {

    public final static int GREATER = -1;
    public final static int EQUAL = 0;
    public final static int INFERIOR = 1;

    private int nombreaDevine;
    private int compteurEssais;

    public Devinette() {
        this.nombreaDevine = (int) (Math.random() * 100);
        if (nombreaDevine == 0) {
            nombreaDevine = 1;
        }
        this.compteurEssais = 0;
    }

    public int jouerNombre(int nombre) {
        int nombreIS;
        if (nombre > nombreaDevine) {
            compteurEssais++;
            nombreIS = GREATER;
        } else if (nombre == nombreaDevine) {
            nombreIS = EQUAL;
        } else {
            nombreIS = INFERIOR;
            compteurEssais++;
        }

        return nombreIS;
    }

    public int getCompteurEssais() {
        return compteurEssais;
    }

}
