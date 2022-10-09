package Atv_3_2;

public class Livro extends Produto {
    String autor;

    Livro(String descricao)  {
        this.descricao = descricao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return autor;
    }

    public String getDescricao() {
        return descricao + "\t" + autor;
    }
}
