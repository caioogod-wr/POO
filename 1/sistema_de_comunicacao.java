package Atv_1;

public class sistema_de_comunicacao {
    public float frequencia_internet;
    private boolean conectado;

    public void setFrequencia(float pFreq) {
        frequencia_internet = pFreq;
    }

    public float getFrequenciaInternet() {
        return frequencia_internet;
    }

    public void setConectado(boolean pBool) {
        conectado = pBool;
    }
    
    public boolean getConectadao() {
        return conectado;
    }
}
