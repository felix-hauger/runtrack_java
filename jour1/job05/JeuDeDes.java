/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job05;

/**
 *
 * @author fel
 */
public class JeuDeDes {

    public static void main(String[] args) {
        int premierDe = (int) (Math.ceil(Math.random() * 6));

        int deuxiemeDe = (int) (Math.ceil(Math.random() * 6));

        System.out.println("Dé 1 : " + premierDe);

        System.out.println("Dé 2 : " + deuxiemeDe);

        System.out.println("Somme : " + (premierDe + deuxiemeDe));
    }
}
