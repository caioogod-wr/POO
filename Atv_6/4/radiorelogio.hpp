#ifndef _RADIORELOGIO_
#define _RADIORELOGIO_
#include <iostream>
#include "relogio.hpp"
#include "radio.hpp"
using namespace std;

class radiorelogio : public relogio, public radio {
    public:
        radiorelogio(double estacao = 97.3, string tipo_onda = "FM", bool ligado = true, string horas = "00:00", string alarme = "08:00") : relogio(horas, alarme), radio(estacao, tipo_onda, ligado) {}
    
        void defineAlarme(string alarme, double estacao) {
            relogio::defineAlarme(alarme);
            radio::setEstacao(estacao);
        }

};

#endif