package Atv_1_1;

public class processador {
    public int frequencia;
    private int num_nucleos;

    public void setFrequencia(int pFreq) {
        frequencia = pFreq;
    }

    public int getFrequencia() {
        return frequencia;
    }

    private void setNum_nucleos(int pNum) {
        num_nucleos = pNum;
    }

    public void constroi_processador() {
        setNum_nucleos(4);
    }

    public int getNum_nucleos() {
        return num_nucleos;
    }

}
