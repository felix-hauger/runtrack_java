/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job04;

/**
 *
 * @author fel
 */
public class CompteBancaire {
    protected double soldeActuel = 0;
    
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire();
        
        compte.soldeActuel = 100.00;
        
        compte.deposer(50);
        
        compte.retirer(30);
        
        compte.retirer(200);
        
        compte.retirer(50);
        
        compte.deposer(140);
    }
    
    public void deposer(double somme) {
        this.soldeActuel = this.soldeActuel + somme;
        
        System.out.println(somme + " € déposés. Nouveau solde : " + this.soldeActuel + " €");
    }
    
    public void retirer(double somme) {
        if (this.soldeActuel < somme) {
            System.out.println("Tentative de retrait de " + somme + " €... Solde insuffisant !");
        } else {
            this.soldeActuel = this.soldeActuel - somme;
            
            System.out.println(somme + " € retirés. Nouveau solde : " + this.soldeActuel + " €");
        }
    }
}
