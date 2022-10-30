#ifndef _COMPLEXOS_
#define _COMPLEXOS_

class Complexo {
    private:
        double real;
        double imaginaria;
    
    public:
        Complexo(double real = 0, double imaginaria = 0);

        double getReal();

        void setReal(double real);

        double getImaginaria();

        void setImaginaria(double imaginaria);
};

Complexo operator+ (Complexo a, Complexo b);

Complexo operator- (Complexo a, Complexo b);

Complexo operator* (Complexo a, Complexo b);

double operator! (Complexo a);

#endif