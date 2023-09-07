/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour2.job07;

/**
 *
 * @author fel
 */
public class ErreursExercice {

    public static void main(String[] args) {
        
        // ArrayIndexOutOfBoundsException
        try {

            int[] testArray = {1, 7, 5};

            int testArrayOutOfBounds = testArray[3];

            System.out.println(testArrayOutOfBounds);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // ArithmeticException
        try {
            double test = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);            
        }
        
        // NullPointerException
        try {
            int[] array = null;

            System.out.println(array[0]);
        } catch (NullPointerException e) {
            System.out.println(e);                        
        }
    }
}
