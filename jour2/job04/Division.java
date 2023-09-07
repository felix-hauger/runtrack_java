/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job04;

/**
 *
 * @author fel
 */
public class Division {
    public double divide(double dividend, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Erreur: DivisionParZeroException");
        }
        
        return dividend / divisor;
    }
}
