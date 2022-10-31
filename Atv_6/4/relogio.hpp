#ifndef _RELOGIO_
#define _RELOGIO_
#include <iostream>
using namespace std;

class relogio {
    private:
        string horas;
        string alarme;

    public:
        relogio(string horas = "00:00", string alarme = "08:00") {
            this->horas = horas;
            this->alarme = alarme;
        }

        void exibeHoras();

        void exibeAlarme();

        void defineHoras(string horas);

        void defineAlarme(string alarme);
};

#endif