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
public class CompteCourant extends CompteBancaire {

    public String toString() {
        return "Solde du compte courant: " + this.soldeActuel + "€";
    }
}
