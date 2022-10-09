package Atv_3_2;

public abstract class Produto {
    String nomeloja;
    double preco;
    String descricao;

    Produto() {
        
    }

    public void setNomeLoja(String nomeloja) {
        this.nomeloja = nomeloja;
    }
    
    public String getNomeLoja() {
        return nomeloja;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    public String getDescricao() {
        return "Produto de Informatica";
    }
}