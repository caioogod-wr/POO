package Atv_3_1;
import java.util.ArrayList;

public class Oficina {
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    Oficina(){
        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta();
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel();
        
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(a1);
        veiculos.add(a2);
    }

    public Veiculo proximo() {
        Veiculo v;
        v = veiculos.get(0);
        veiculos.remove(0);
        return v;
    }

    public void Manutencao(Veiculo v) {
        Bicicleta b = new Bicicleta();
        if(v.getClass() == b.getClass()) {
            b.listarVerificacoes();
            b.ajustar();
            b.limpar();
            v = b;
        }

        Automovel a = new Automovel();
        if(v.getClass() == a.getClass()) {
            a.listarVerificacoes();
            a.ajustar();
            a.limpar();
            a.trocarOleo();
            v = a;
        }
    }
}