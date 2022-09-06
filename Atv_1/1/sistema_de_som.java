package Atv_1_1;

public class sistema_de_som {
    public int volume;
    private String dispositivo_saida;

    private void setVolume(int pVol) {
        volume = pVol;
    }

    public void mutar() {
        setVolume(0);
    }

    public int getVolume() {
        return volume;
    }

    public void setDispositivo_saida(String pDisp) {
        dispositivo_saida = pDisp;
    }

    public String getDispositivo_saida() {
        return dispositivo_saida;
    }
}