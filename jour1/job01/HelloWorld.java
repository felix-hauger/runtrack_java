/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job01;

import java.util.Scanner;

/**
 *
 * @author fel
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Veuillez saisir votre nom : ");
        
        String username = userInput.nextLine();
        
        System.out.println("Bienvenue " + username);
    }
}
