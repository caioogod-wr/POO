#include <iostream>
#include <cmath>

class Complexo {
    private:
        double real;
        double imaginaria;
    
    public:
        Complexo(double real, double imaginaria) {
            this->real = real;
            this->imaginaria = imaginaria;
        }

        Complexo soma(const Complexo a);

        Complexo subtracao(const Complexo a);

        Complexo multiplicacao(const Complexo a);

        double modulo();

        double getReal();

        double getImaginaria();
};

Complexo Complexo::soma(const Complexo a) {
    Complexo c(a.real + this->real, a.imaginaria + this->imaginaria);
    return c;
}

Complexo Complexo::subtracao(const Complexo a) {
    Complexo c(this->real - a.real, this->imaginaria - a.imaginaria);
    return c;
}

Complexo Complexo::multiplicacao(const Complexo a) {
    Complexo c((a.real * this->real) - (a.imaginaria * this->imaginaria), (a.real * this->imaginaria) + (a.imaginaria * this->real));
    return c;
}

double Complexo::modulo() {
    return sqrt(pow(this->real, 2) + pow(this->imaginaria, 2));
}

double Complexo::getReal() {
    return this->real;
}

double Complexo::getImaginaria() {
    return this->imaginaria;
}