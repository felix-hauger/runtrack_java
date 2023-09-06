/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job02;

/**
 *
 * @author fel
 */
public class Voiture {
    String marque = "Renault";
    
    String couleur = "rouge";

    int vitesse = 0;

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        
        voiture.demarrer();
        
        voiture.accelerer();
        
        voiture.accelerer();
        
        voiture.arreter();
    }
    
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
    
    public void accelerer() {
        this.vitesse = this.vitesse + 10;

        System.out.println("La vitesse est maintenant de " + this.vitesse + "km/h");
    }
    
    public void arreter() {
        this.vitesse = 0;
        
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h");
    }
}
