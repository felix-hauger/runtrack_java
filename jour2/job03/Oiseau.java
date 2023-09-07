/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job03;

/**
 *
 * @author fel
 */
public class Oiseau extends Animal {

    public static void main(String[] args) {
        Oiseau oiseau = new Oiseau();

        oiseau.faireDuBruit();
    }

    public void faireDuBruit() {
        System.out.println("L'oiseau chante");
    }
}
