/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista7_questão3;

/**
 *
 * @author caioo
 */
public class Lista7_Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvore arv = new Arvore("Caio");
        arv.ImprimeOrdenado();
        arv.Insere("Hugo");
        arv.ImprimeOrdenado();
        arv.Insere("Chiarotto");
        arv.Insere("Cecagol");
        arv.Insere("Arthur");
        arv.Insere("Daniel");
        arv.ImprimeOrdenado();
        arv.Busca("Caio");
        arv.Busca("Robson");
        arv.Insere("Zacarias");
        arv.Remove("Hugo");
        arv.ImprimeOrdenado();
        
    }
    
}
