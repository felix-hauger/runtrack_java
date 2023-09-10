/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jour3.job04;

/**
 *
 * @author fel
 * @param <T>
 */
public class Boite<T> {
    
    private T element;
    
    public T recupererElement() {
        return this.element;
    }
    
    public void definirElement(T element) {
        this.element = element;
    }
}
