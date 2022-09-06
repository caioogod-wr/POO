package Atv_1;

public class sistema_de_som {
    public int volume;
    private String dispositivo_saida;

    public void setVolume(int pVol) {
        volume = pVol;
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