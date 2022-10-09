package Atv_3_2;

public class Mouse extends Produto {
    private String tipo;

    Mouse(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao + "\t" + tipo;
    }
}
