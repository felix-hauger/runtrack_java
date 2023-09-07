/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job02;

/**
 *
 * @author fel
 */
public class Homme implements Nageur {
    public static void main(String[] args) {
        Homme homme = new Homme();
        
        homme.nager();
    }

    public void nager() {
        System.out.println("L'homme nage");
    }
}
