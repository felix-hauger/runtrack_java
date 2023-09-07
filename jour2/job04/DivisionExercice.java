/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job04;

/**
 *
 * @author fel
 */
public class DivisionExercice {

    public static void main(String[] args) {
        Division division = new Division();
        
        try {
            double result = division.divide(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
         
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
