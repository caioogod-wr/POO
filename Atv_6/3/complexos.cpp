#include <iostream>
#include <cmath>

class Complexo {
    private:
        double real;
        double imaginaria;
    
    public:
        Complexo(double real = 0, double imaginaria = 0) {
            this->real = real;
            this->imaginaria = imaginaria;
        }

        double modulo();

        double getReal();

        void setReal(double real);

        double getImaginaria();

        void setImaginaria(double imaginaria);
};

double Complexo::modulo() {
    return sqrt(pow(this->real, 2) + pow(this->imaginaria, 2));
}

double Complexo::getReal() {
    return this->real;
}

void Complexo::setReal(double real) {
    this->real = real;
}

double Complexo::getImaginaria() {
    return this->imaginaria;
}

void Complexo::setImaginaria(double imaginaria) {
    this->imaginaria = imaginaria;
}

Complexo operator+ (Complexo a, Complexo b) {       //sobrecarga do aoperador de soma
    Complexo c(0,0);
    c.setReal(a.getReal() + b.getReal());
    c.setImaginaria(a.getImaginaria() + b.getImaginaria());
    return c;
}

Complexo operator- (Complexo a, Complexo b) {       //sobrecarga do aoperador de subtracao
    Complexo c(0,0);
    c.setReal(a.getReal() - b.getReal());
    c.setImaginaria(a.getImaginaria() - b.getImaginaria());
    return c;
}

Complexo operator* (Complexo a, Complexo b) {       //sobrecarga do aoperador de multiplicacao
    Complexo c(0,0);
    c.setReal((a.getReal() * b.getReal()) - (a.getImaginaria() * b.getImaginaria()));
    c.setImaginaria((a.getReal() * b.getImaginaria()) + (a.getImaginaria() * b.getReal()));
    return c;
}

double operator! (Complexo a) {                   //criacao de um operador de modulo
   return sqrt(pow(a.getReal(), 2) + pow(a.getImaginaria(), 2)); 
}