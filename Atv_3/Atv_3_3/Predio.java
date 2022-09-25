package Atv_3_3;

public abstract class Predio implements PegadaDeCarbono {
    private double constroi;

    Predio() {
        constroi = 1;
    }

    public void ConstroiPredio()  {
        constroi++;
    }

    public double getPegadaDeCarbono() {
        return constroi * (1000*DioxidoDeCarbonoEq_Carbono + 10*DioxidoDeCarbonoEq_Metano + 0.1*DioxidoDeCarbonoEq_OxidoNitroso);
    }
}
