/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author fel
 */
public class MotsUniquesExercice {

    public static void main(String[] args) {
        ArrayList mots = new ArrayList<>(Arrays.asList(args));

        // Test s'il y a des mots uniques pour changer l'output
        boolean motsUniquesDansChaine = false;

        String motsUniquesChaine = "Mots uniques: ";

        for (String a : args) {
            if (Collections.frequency(mots, a) == 1) {
                motsUniquesChaine += a + ", ";

                motsUniquesDansChaine = true;
            }
        }

        if (motsUniquesDansChaine) {
            System.out.println(motsUniquesChaine.substring(0, motsUniquesChaine.length() - 2));
        } else {
            System.out.println("Il n'y a pas de mot unique dans l'input.");
        }
    }
}
