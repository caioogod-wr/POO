package Atv_1_1;

public class tela_touch {
    public boolean ligada;
    private int brilho;

    private void setLigada(boolean pLigada) {
        ligada = pLigada;
    }

    public void desliga_inatividade() {
        setLigada(false);
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setBrilho(int pBrilho) {
        brilho = pBrilho;
    }

    public int getBrilho() {
        return brilho;
    }
}
