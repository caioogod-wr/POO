package Atv_5;

public class Elemento {
    private int valor;
    public Elemento proximo;

    Elemento(int valor) {
        setValor(valor);
        proximo = null;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void addProximo(Elemento elem) {
        proximo = elem;
    }

    public void removeProx() {
        proximo = proximo.proximo;
    }
}
