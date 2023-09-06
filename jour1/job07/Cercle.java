/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour1.job07;

/**
 *
 * @author fel
 */
public class Cercle {
    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        
        cercle.calculerAire(5);
    }
    
    public void calculerAire(double longueurRayon) {
        double aire = longueurRayon * longueurRayon * Math.PI;
        
        System.out.println("Aire du cercle de rayon " + longueurRayon + " : " + aire);
    }}
