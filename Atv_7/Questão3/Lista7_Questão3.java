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
        Arvore arv = new Arvore("Batata");
        arv.ImprimeOrdenado();
        arv.Insere("Limao");
        arv.ImprimeOrdenado();
        arv.Insere("Inhame");
        arv.Insere("Banana");
        arv.Insere("Chocolate");
        arv.Insere("Mamao");
        arv.ImprimeOrdenado();
        arv.Busca("Batata");
        arv.Busca("Cha");
        arv.Insere("Leite");
        arv.Remove("Inhame");
        arv.ImprimeOrdenado();
        
    }
    
}
