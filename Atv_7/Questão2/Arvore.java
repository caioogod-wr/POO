/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7_questão3;

/**
 *
 * @author caioo
 */
public class Arvore <T extends Comparable> {
    private No<T> raiz;
    
    public Arvore(T dado) {
        raiz = new No<T> (dado);
    }
    
    //Inserção
    public void Insere(T dado) {
        No<T> aux = raiz;
        No<T> prev = null;
        //Esq == true; Dir == false;
        boolean Esq_Dir = true;
        
        if(dado == null)
            return;
        
        while(aux != null) {
            if(dado.compareTo(aux.getDado()) <= 0) { //se o valor do dado é "menor" ou igual que aquele do nó atual, vai para a esquerda
                prev = aux;
                aux = aux.getEsq();
                Esq_Dir = true;
            } else { //se o valor do dado é "maior" que aquele do nó atual, vai para a direita
                prev = aux;
                aux = aux.getDir();
                Esq_Dir = false;
            }
        }
        if(Esq_Dir == true) { //se o elemento deve ser inserida à esquerda
            prev.setEsq(dado);
        }
        else { //se o elemento deve ser inserido à direita
            prev.setDir(dado);
        }
    }
    
    
    //Busca
    public int Busca(T dado) {
        No<T> aux = raiz;
        
        while(aux != null && aux.getDado() != dado) {
            if(dado.compareTo(aux.getDado()) <= 0) //Caso o dado buscado seja "menor" que aquele do nó atual, vai para esquerda
                aux = aux.getEsq();
            else
                aux = aux.getDir(); //Caso o dado buscado seja "maior" que aquele do nó atual, vai para direita
        }
        
        if(aux == null) {
            System.out.println(dado + " nao esta na arvore.");
            return 1;
        }
        else {
            System.out.println(aux.getDado() + " foi encontrado!");
            return 0;
        }
    }
    
    
    //Remoção
    private void reinsereRecursivo(No<T> no) {
        if(no != null) {
            Insere(no.getDado());
            reinsereRecursivo(no.getEsq());
            reinsereRecursivo(no.getDir());
        }
    }
    
    private void reinsereGalho(No<T> no) {
        reinsereRecursivo(no);
    }
    
    public int Remove(T dado) {
        No<T> aux = raiz;
        No<T> prev = null;
        //Esq == true; Dir == false;
        boolean Esq_Dir = true;
        
        while(aux != null && aux.getDado() != dado) {
            if(dado.compareTo(aux.getDado()) <= 0) { //se o valor do dado é "menor" ou igual que aquele do nó atual, vai para a esquerda
                prev = aux;
                aux = aux.getEsq();
                Esq_Dir = true;
            } else { //se o valor do dado é "maior" que aquele do nó atual, vai para a direita
                prev = aux;
                aux = aux.getDir();
                Esq_Dir = false;
            }
        }
        if(aux == null) { //se o elemento nao foi encontradao
            System.out.println(dado + " nao pode ser removido pois ele(a) nao esta na arvore.");
            return 1;
        }
        
        //cria referencia para nós filhos do nó que será removido
        No<T> aux_esq = aux.getEsq();
        No<T> aux_dir = aux.getDir();
        
        if(Esq_Dir == true) { //se o elemento a ser removido esta à esquerda do "prev"
            prev.setEsqNull();
            reinsereGalho(aux_esq);
            reinsereGalho(aux_dir);
            System.out.println(dado + " removido!");
            return 0;
        }
        else { //se o elemento a ser removido esta à direita do "prev"
            prev.setDirNull();
            reinsereGalho(aux_esq);
            reinsereGalho(aux_dir);
            System.out.println(dado + " removido!");
            return 0;
        }
    }
    
    
    //Impressão
    private void ImprimeRecursivo(No<T> raiz) {
        No<T> aux = raiz;
        
        if(aux.getEsq() != null) {
            ImprimeRecursivo(aux.getEsq());
        }
        
        System.out.println(aux.getDado());
        
        if(aux.getDir() != null) {
            ImprimeRecursivo(aux.getDir());
        }
    }
    
    public void ImprimeOrdenado() {
        System.out.println("-".repeat(10));
        ImprimeRecursivo(raiz);
        System.out.println("-".repeat(10));
    }
}
