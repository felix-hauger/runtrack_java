/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job05;

/**
 *
 * @author fel
 */
public class Voiture {

    String marque = "Renault";

    String couleur = "rouge";

    int vitesse = 0;

    public void demarrer() {
        System.out.println("La voiture démarre");
    }
    
    public void definirVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerer() {
        this.vitesse = this.vitesse + 10;

        System.out.println("La vitesse est maintenant de " + this.vitesse + "km/h");

        try {
            this.verifierVitesse();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifierVitesse() throws Exception {
        if (this.vitesse > 100) {
            throw new Exception("Erreur: VitesseLimiteDepasseeException");
        }
    }

    public void arreter() {
        this.vitesse = 0;

        System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h");
    }
}
