#ifndef _COMPLEXOS_
#define _COMPLEXOS_

class Complexo {
    private:
        double real;
        double imaginaria;
    
    public:
    Complexo(double real, double imaginaria);

    Complexo soma(const Complexo a);

    Complexo subtracao(const Complexo a);

    Complexo multiplicacao(const Complexo a);

    double modulo();
    
    double getReal();

    double getImaginaria();  
};

#endif