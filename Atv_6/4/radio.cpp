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

double radio::getEstacao() {
    return this->estacao;
}

string radio::getTipoOnda() {
    return this->tipo_onda;
}

string radio::getLigado() {
    if(this->ligado == true)
        return "ligado";
    else
        return "desligado";
}

void radio::setEstacao(double estacao) {
    this->estacao = estacao;
}

void radio::mudaTipoOnda() {
    if(this->tipo_onda == "FM")
        this->tipo_onda = "AM";
    else
        this->tipo_onda = "FM";
}

void radio::liga() {
    this->ligado = true;
}

void radio::desliga() {
    this->ligado = false;
}
