#include <iostream>
#include "relogio.hpp"
#include "radio.hpp"
#include "radiorelogio.hpp"
using namespace std;

int main() {
    radiorelogio A;
    A.exibeHoras();
    A.defineAlarme("Som de Ondas", 99.5);
    A.exibeAlarme();
    A.desliga();
    A.mudaTipoOnda();
    A.defineHoras("22:44");
    A.exibeHoras();

    cout << "Estacao: " << A.getEstacao() << endl;
    cout << "Ligado/Desligado: " << A.getLigado() << endl;
    cout << "Tipo de onda: " << A.getTipoOnda() << endl;
}