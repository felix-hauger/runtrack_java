/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job01;

import jour1.job04.CompteBancaire;

/**
 *
 * @author fel
 */
public class CompteEpargne extends CompteBancaire {

    float tauxDInteret;
    
    public static void main(String[] args) {
        //System.out.println("toto");
    }

    public void definirTauxDInteret(float tauxDInteret) {
        this.tauxDInteret = tauxDInteret;
    }

    public void ajouterInteret() {
        double interets = this.soldeActuel * this.tauxDInteret / 100;

        this.soldeActuel = this.soldeActuel + interets;

        System.out.println("Intérêts ajoutés: " + interets + "€. Nouveau solde: " + this.soldeActuel + "€");
    }

    public String toString() {
        return "Solde du compte épargne: " + this.soldeActuel + "€ avec un taux d'intérêt de " + this.tauxDInteret + "%";
    }
}
