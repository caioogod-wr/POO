/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1c.java;

/**
 *
 * @author arthu
 */
public class Termo {
    private int grau;
    private int coeficiente;
    
    public Termo(int pGrau){
        grau = pGrau;
        coeficiente = 0;
    }
    
    public void setTermoCoeficiente(int coeficiente){
        this.coeficiente = coeficiente;
    }
    
    public int getGrau(){
        return grau;
    }
    
    public int getCoeficiente(){
        return coeficiente;
    }
    
    public void somaCoeficiente(int coeficiente){
        this.coeficiente += coeficiente;
    }
    
    public void imprimeTermo(){
        System.out.print(coeficiente + "x^" + grau);
    }
    
    public int resultadoTermo(int x){
        int produto = 1;
        for(int i = 0; i < grau; i++){
            produto = produto * x;
        }
        return coeficiente * produto;
    }
}
