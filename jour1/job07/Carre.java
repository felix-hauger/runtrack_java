/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job07;

/**
 *
 * @author fel
 */
public class Carre {
    public static void main(String[] args) {
        Carre carre = new Carre();
        
        carre.calculerAire(8);
    }
    
    public void calculerAire(double longueurCote) {
        double aire = longueurCote * longueurCote;
        
        System.out.println("Aire du carré de côté " + longueurCote + " : " + aire);
    }
}
