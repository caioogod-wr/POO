#include <iostream>
#include <thread>
#include <mutex>

class contaCorrente {
    private:
        double saldo;
        std::mutex token;

    public:
        contaCorrente();
        void deposita(int valor, int n);
        void saca(int valor, int n);
        double getSaldo();
};

contaCorrente::contaCorrente() {
    saldo = 0;
}

// Deposita valor na conta "n" vezes
void contaCorrente::deposita(int valor, int n) {
    int saldo_aux;
    for(int i = 0; i < n; i++) {
        token.lock(); // block dentro do for promove maior paralelismo

        // Le saldo
        saldo_aux = this->saldo;
        
        // Calcula novo saldo
        saldo_aux += valor;

        //Atribui novo valor para o saldo da conta 
        this->saldo = saldo_aux;

        token.unlock();
    }
}

// Saca dinheiro na conta "n" vezes
void contaCorrente::saca(int valor, int n) {
    int saldo_aux;
    for(int i = 0; i < n; i++) {
        token.lock(); // block dentro do for promove maior paralelismo

        // Le saldo
        saldo_aux = this->saldo;
        
        // Calcula novo saldo
        saldo_aux -= valor;

        // Atribui novo valor para o saldo da conta
        this->saldo = saldo_aux;

        token.unlock();
    }
}

double contaCorrente::getSaldo()  {
    return this->saldo;
}


int main()  {
    contaCorrente *conta = new contaCorrente();
    std::thread cliente1 (&contaCorrente::deposita, conta, 1000, 5000);
    std::thread cliente2 (&contaCorrente::saca, conta, 500, 5000);
    std::thread cliente3 (&contaCorrente::saca, conta, 900, 5000);
    std::thread cliente4 (&contaCorrente::deposita, conta, 300, 5000);

    cliente1.join();
    cliente2.join();
    cliente3.join();
    cliente4.join();

    printf("%f\n", conta->getSaldo());
}