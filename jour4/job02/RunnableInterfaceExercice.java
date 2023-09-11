/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour4.job02;

/**
 *
 * @author fel
 */
public class RunnableInterfaceExercice implements Runnable {
    public static void main(String[] args) {
        RunnableInterfaceExercice runnableInterface = new RunnableInterfaceExercice();
        
        runnableInterface.run();
    }
    
    public void run() {
        new Thread(() -> {
           try {
               for (int i = 0; i < 5; i++) {
                   System.out.println("En cours d'exécution...");
                   
                   Thread.sleep(1000);
               }
           } catch (Exception e) {
               System.out.println(e);
           }
        }).start();
    }
}
