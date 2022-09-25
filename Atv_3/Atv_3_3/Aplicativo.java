package Atv_3_3;

import java.util.ArrayList;

public class Aplicativo {
    public static void main(String args[]) {
        Carro Mustang = new Carro();
        Carro Fusca = new Carro();
        //Predio Residencial = new Predio();
        //Predio Comercial = new Predio();
        Casa casa = new Casa();
        Escola escola = new Escola();
        Bicicleta Caloi = new Bicicleta();
        Bicicleta Sense = new Bicicleta();

        ArrayList<PegadaDeCarbono> pegada = new ArrayList<>();
        
        pegada.add(Mustang);
        pegada.add(Fusca);
        //pegada.add(Residencial);
        //pegada.add(Comercial);
        pegada.add(casa);
        pegada.add(escola);
        pegada.add(Caloi);
        pegada.add(Sense);

        //Residencial.ConstroiPredio();
        escola.ConstroiPredio();
        Mustang.Anda();
        Caloi.Anda();

        for(int i = 0; i < pegada.size(); i++) {
            System.out.println(pegada.get(i).getPegadaDeCarbono());
        }
    }
}
