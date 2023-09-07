/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job03;

/**
 *
 * @author fel
 */
public class Chien extends Animal {

    public static void main(String[] args) {
        Chien chien = new Chien();

        chien.faireDuBruit();
    }

    public void faireDuBruit() {
        System.out.println("Le chien aboie");
    }
}
