/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job03;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fel
 */
public class EtudiantsMapExercice {

    public static void main(String[] args) {
        Map<Integer, String> etudiants = new HashMap<Integer, String>();

        etudiants.put(101, "Pierre");
        etudiants.put(102, "Marie");
        etudiants.put(103, "Jean");

        for (int key : etudiants.keySet()) {
            System.out.println(key + ": " + etudiants.get(key));
        }
    }
}
