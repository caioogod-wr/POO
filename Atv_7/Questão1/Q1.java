/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author caioo
 */
public class Q1 <T extends Number & Comparable> {
    private T val1;
    private T val2;
    
    public Q1(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    
    public T getMax() {
        if(val1.compareTo(val2) <= 0)
            return val2;
        return val1;
    }
    
    public T getMin() {
        if(val1.compareTo(val2) <= 0)
            return val1;
        return val2;
    }
    
    public String toString() {
        return (val1.toString() + val2.toString());
    }
}
