/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1c.java;

/**
 *
 * @author arthu
 */
public class Atividade1cJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Polinomio p = new Polinomio(5);
        p.Mostra();
        
        Termo t1 = new Termo(2);
        t1.setTermoCoeficiente(5);
        
        p.Add(t1);
        p.Mostra();
        
        System.out.println(p.Calcula(3));
    }
    
}
