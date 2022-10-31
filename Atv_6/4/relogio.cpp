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

void relogio::exibeHoras() {
    cout << "Horas:\t" << this->horas << endl;
}

void relogio::exibeAlarme() {
    cout << "Alarme:\t" << this->alarme << endl;
}

void relogio::defineHoras(string horas) {
    this->horas = horas;
}

void relogio::defineAlarme(string alarme) {
    this->alarme = alarme;
}