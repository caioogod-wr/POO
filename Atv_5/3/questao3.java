package Atv_5;

public class questao3 {
    public static void main(String[] args) {
        MinhaListaEncadeada lista = new MinhaListaEncadeada();
        lista.addFinal(5);
        lista.addFinal(6);
        lista.addFinal(9);
        lista.imprimeLista();
        lista.removeElemento(6);
        lista.imprimeLista();
        lista.removeElemento(5);
        lista.removeElemento(0);
        lista.imprimeLista();
        lista.removeElemento(9);
        lista.imprimeLista();
        lista.addFinalN(4);
        lista.imprimeLista();
    } 

}
