#include <iostream>
#include <random>
#include <chrono>
#include <list>

using namespace std;

int main() {
    long int n = 1000000;
    long int limite_inferior = 0;
    long int limite_superior = 100000;
    uniform_real_distribution<double> conjunto(limite_inferior, limite_superior);
    default_random_engine gerador;
    list<double> lista;

    // Pega tempo inicial
    auto tempo_inicial = chrono::high_resolution_clock::now();

    // Insere números aleatórios no vetor
    for(int i = limite_inferior; i < n; i++)
        lista.push_front(conjunto(gerador));

    // Imprime números aleatórios
    list<double>::iterator it;
    for(it = lista.begin(); it != lista.end(); it++)
        cout << *it << endl;

    // Realiza operação de busca sobre metade dos elementos
    it = lista.begin();
    double valor_buscado;
    for(int i = 0; i < n/2; i++, it++)
        valor_buscado = *it;
     
    // Remove elementoss
    lista.clear();
    
    // Pega tempo final
    auto tempo_final = chrono::high_resolution_clock::now();

    // Calcula tempo de execução
    auto duracao = chrono::duration_cast<chrono::seconds>(tempo_final-tempo_inicial);
    cout << "Tempo de execucao: " << duracao.count() << " segundos" << endl;

    return 0;
}

