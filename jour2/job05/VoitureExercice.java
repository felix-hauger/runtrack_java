/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job05;

/**
 *
 * @author fel
 */
public class VoitureExercice {

    public static void main(String[] args) {
        Voiture voiture = new Voiture();

        try {

            voiture.definirVitesse(110);
            
            voiture.verifierVitesse();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
