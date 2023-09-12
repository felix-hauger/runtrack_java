/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author fel
 */
public class StreamsOperationExercice {
    public static void main (String[] args) {
        
        Stream<String> stream = Arrays.stream(args);
        
        Stream<Integer> streamInteger = stream.map(i -> Integer.valueOf(i));
                
        Stream<Integer> streamDoubled = streamInteger.map(i -> i * 2);
        
        ArrayList<Integer> listFiltered = new ArrayList<Integer>();
        
        streamDoubled.forEach(i -> {
            if (i <= 10) {
                listFiltered.add(i);
            }
        });
        
        System.out.println("Résultat: " + listFiltered);
    }
}
