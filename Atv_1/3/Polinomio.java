/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1c.java;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class Polinomio {
    private ArrayList<Termo> termos;
    private int grauMax;
    
    public Polinomio(int pGrauMax){
        grauMax = pGrauMax;
        termos = new ArrayList<Termo>();
        for(int i = 0; i <= grauMax; i++){
            Termo t = new Termo(i);
            termos.add(i, t);
        }
    }
    
    public void Add(Termo termo){
        if(termo.getGrau() > grauMax){
            System.out.println("Grau maior que o máximo");
            return;
        }
        termos.get(termo.getGrau()).somaCoeficiente(termo.getCoeficiente());
    }
    
    public void Mostra(){
        System.out.print("y = ");
        for(int i = 0; i <= grauMax; i++){
            termos.get(i).imprimeTermo();
            if(i < grauMax)
                System.out.print(" + ");
        }
        System.out.println();
    }
    
    public int Calcula(int x){
        int soma = 0;
        for(int i = 0; i <= grauMax; i++){
            soma += termos.get(i).resultadoTermo(x);
        }
        return soma;
    }
}
