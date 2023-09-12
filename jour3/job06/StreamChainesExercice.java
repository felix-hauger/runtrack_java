/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job06;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author fel
 */
public class StreamChainesExercice {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(args);
        
        stream.filter(s -> s.length() == 3 && s.charAt(0) == 'a')
                .forEach(s -> System.out.println(s));
    }
}
