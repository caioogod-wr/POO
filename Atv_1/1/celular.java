package Atv_1_1;

public class celular {
    private processador prc;
    private sistema_de_som sis;
    private tela_touch tlt;
    private sistema_de_comunicacao sic;

    public void conecta_dispositivo()  {
        sic.setConectado(true);
    }

    public void liga_tela() {
        tlt.desliga_inatividade();
    }

    public void overclock() {
        prc.setFrequencia(5200);
    }

    public void coloca_fone() {
        sis.setDispositivo_saida("Fone de ouvido");
    }
}