/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job01;

import java.util.ArrayList;

/**
 *
 * @author fel
 */
public class ListeEntiersExercice {

    public static void main(String[] args) {
        ListeEntiersExercice listeEntiersExercice = new ListeEntiersExercice();

        ArrayList<Integer> listeEntiers = listeEntiersExercice.creerListe(args);

        ArrayList<Integer> listePairs = listeEntiersExercice.trouverPairs(listeEntiers);

        int sommePairs = listeEntiersExercice.sommeListe(listePairs);

        System.out.println(sommePairs);

    }
    
    public ArrayList<Integer> creerListe(String[] args) {
        ArrayList<Integer> listeEntiers = new ArrayList<Integer>();

        for (String i : args) {

            listeEntiers.add(Integer.valueOf(i));

        }

        return listeEntiers;
    }

    public ArrayList<Integer> trouverPairs(ArrayList<Integer> list) {
        ArrayList<Integer> listePairs = new ArrayList<Integer>();

        for (int i : list) {
            if (i % 2 == 0) {
                listePairs.add(i);
            }
        }

        return listePairs;
    }

    public int sommeListe(ArrayList<Integer> list) {
        int result = 0;

        for (int i : list) {
            result += i;
        }

        return result;
    }    
}
