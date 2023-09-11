/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour4.job01;

/**
 *
 * @author fel
 */
public class SimpleThreadExercice {
    public static void main(String[] args) {
        new Thread(() -> {
           try {
               for (int i = 0; i < 5; i++) {
                   System.out.println("Salut du thread");
                   
                   Thread.sleep(1000);
               }
           } catch (Exception e) {
               System.out.println(e);
           }
        }).start();
    }
}
