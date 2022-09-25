package Atv_3_3;

public class Carro implements PegadaDeCarbono {
    double EmiteGasEstufa;

    Carro()  {
        EmiteGasEstufa = 1;
    }
    
    public void Anda() {
        EmiteGasEstufa++;
    }

    public double getPegadaDeCarbono() {
        return EmiteGasEstufa * (DioxidoDeCarbonoEq_Carbono + 2*DioxidoDeCarbonoEq_Metano);
    }
}
