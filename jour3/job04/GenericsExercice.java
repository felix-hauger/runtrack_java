/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job04;

/**
 *
 * @author fel
 */
public class GenericsExercice {
    public static void main (String[] args) {
        // Je ne vois pas comment définir le type du Generic avec l'argument...
        // Le type est défini à la compilation et la variable à l'exécution
        // Utiliser des classes filles ?
        Boite<String> boite = new Boite<>();
        
        try {
            boite.definirElement(args[0]);

            System.out.println(boite.recupererElement());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Veuillez définir l'élément de la boîte");            
        }
        

    }
}
