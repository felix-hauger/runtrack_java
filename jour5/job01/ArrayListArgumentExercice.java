/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour5.job01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fel
 */
public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        ArrayList<String> argumentsArrayList = new ArrayList<String>();
        
        argumentsArrayList.addAll(Arrays.asList(args));
        
        argumentsArrayList.forEach(a -> System.out.println(a));
    }
}
