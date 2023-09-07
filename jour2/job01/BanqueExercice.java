/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job01;

/**
 *
 * @author fel
 */
public class BanqueExercice {

    public static void main(String[] args) {
        CompteCourant compteCourant = new CompteCourant();

        CompteEpargne compteEpargne = new CompteEpargne();

        compteCourant.deposer(Double.parseDouble(args[0]));

        System.out.println(compteCourant.toString());

        compteEpargne.definirTauxDInteret(Float.parseFloat(args[2]));

        compteEpargne.deposer(Double.parseDouble(args[1]));

        System.out.println(compteEpargne.toString());

        compteEpargne.ajouterInteret();

    }
}
