/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job03;

import java.util.Scanner;

/**
 *
 * @author fel
 */
public class Calculatrice {
    double premierNombre;
    
    double secondNombre;
    
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Entrez le premier nombre : ");
        
        calc.premierNombre = userInput.nextInt();
        
        System.out.print("Entrez le deuxième nombre : ");
        
        calc.secondNombre = userInput.nextInt();
        
        calc.additioner();

        calc.soustraire();

        calc.multiplier();

        calc.diviser();
    }
    
    public void additioner() {
        double somme = this.premierNombre + this.secondNombre;
        
        System.out.println("Somme : " + somme);
    }
    
    public void soustraire() {
        double difference = this.premierNombre - this.secondNombre;
        
        System.out.println("Différence : " + difference);    }
    
    public void multiplier() {
        double produit = this.premierNombre * this.secondNombre;
        
        System.out.println("Produit : " + produit);
    }
    
    public void diviser() {
        double division = this.premierNombre / this.secondNombre;
        
        System.out.println("Division : " + division);    }
}
