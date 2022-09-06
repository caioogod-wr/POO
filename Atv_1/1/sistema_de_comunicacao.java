package Atv_1_1;

public class sistema_de_comunicacao {
    public double frequencia_internet;
    private boolean conectado;

    private void setFrequencia(double pFreq) {
        frequencia_internet = pFreq;
    }

    public void define_frequencia_padrao() {
        setFrequencia(97.3);
    }

    public double getFrequenciaInternet() {
        return frequencia_internet;
    }

    public void setConectado(boolean pBool) {
        conectado = pBool;
    }
    
    public boolean getConectadao() {
        return conectado;
    }
}
