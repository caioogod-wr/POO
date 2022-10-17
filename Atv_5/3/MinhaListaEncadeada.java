package Atv_5;

public class MinhaListaEncadeada {
    private Elemento inicio; //cabeça da lista encadeada
    
    MinhaListaEncadeada() {
        inicio = null;
    }

    public void addFinal(int valor) {
        System.out.println("Adicionando " + valor);
        if(inicio == null) {
            inicio = new Elemento(valor);
            return;
        }
        
        Elemento aux;
        Elemento prox;
        for(aux = inicio, prox = inicio.getProximo(); prox != null; aux = aux.getProximo(), prox = prox.getProximo());
        prox = new Elemento(valor);
        aux.addProximo(prox);
    }


    public void imprimeLista() {
        Elemento aux = inicio;
        for(aux = inicio; aux != null; aux = aux.getProximo()) {
            System.out.println("Elemento " + ": " + aux.getValor());
        }
        System.out.println("--------------------------------------------------------------");
    }

    public void removeElemento(int valor) {
        if(inicio.getValor() == valor) {
            inicio = inicio.getProximo();
            return;
        }
        Elemento auxAnt;
        Elemento aux;
        for(auxAnt = inicio, aux = inicio.getProximo(); aux != null; aux = aux.getProximo()) {
            if(aux.getValor() == valor) {
                auxAnt.removeProx();
                return;
            }
        }
        System.out.println("Elemento " + valor + " nao encontrado");
    }

    public void addFinalN(int valor) {
        for(int i = valor; i != 0; i--) {
            addFinal((valor+1)-i);
        }
    }
}   