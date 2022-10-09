package Atv_3_2;

import java.util.Vector;

public class Main {
    public static void main(String args[]) {
        Vector<Produto> carrinho = new Vector<Produto>(); //cria vetor, que tem tamanho inicial 10
        
        Mouse mouse1 = new Mouse("RGB");
        mouse1.setPreco(50);
        mouse1.setTipo("Gamer");
        Livro livro1 = new Livro("Eragon, Aventura");
        livro1.setPreco(20);
        livro1.setAutor("Paolini");
        Mouse mouse2 = new Mouse("Wireless");
        mouse2.setPreco(100);
        mouse2.setTipo("Recarregavel");
        
        carrinho.add(mouse1);
        carrinho.add(livro1);
        carrinho.add(mouse2);

        for(int i = 0; i < carrinho.size(); i++) {
            System.out.println(carrinho.get(i).getDescricao() + "\t" + carrinho.get(i).getPreco());
        }
    }
}