#ifndef _RADIO_
#define _RADIO_
#include <iostream>
using namespace std;

class radio {
    private:
        double estacao;
        string tipo_onda;
        bool ligado;
    
    public:
        radio(double estacao = 97.3, string tipo_onda = "FM", bool ligado = true) {
            this->estacao = estacao;
            this->tipo_onda = tipo_onda;
            this->ligado = ligado;
        }

        double getEstacao();
        
        string getTipoOnda();

        string getLigado();

        void setEstacao(double estacao);

        void mudaTipoOnda();

        void liga();

        void desliga();
};

#endif