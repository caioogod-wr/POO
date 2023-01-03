#include <iostream>

template <class T> class NoGenerico {
    T valor;
    NoGenerico<T> *direita;
    NoGenerico<T> *esquerda;
    
    public:
        NoGenerico(T valor) {
            this->valor = valor;
            direita = nullptr;
            esquerda = nullptr;
        }

        T getValor();
        // Método para comparação de nós com base em seus valores
        int EhMaior(T valor);
        void setDireita(NoGenerico *no);
        void setEsquerda(NoGenerico *no);
        NoGenerico *getDireita();
        NoGenerico *getEsquerda();
};

template <class T> T NoGenerico<T>::getValor() {
    return this->valor;
}

template <class T> int NoGenerico<T>::EhMaior(T valor) {
    // Se o valor do nó que chamou o método é maior, retorna 1. Caso o contrário, retorna 0.
    return (this->valor > valor) ? 1 : 0;
}

template <class T> void NoGenerico<T>::setDireita(NoGenerico *no) {
    this->direita = no;
}

template <class T> void NoGenerico<T>::setEsquerda(NoGenerico *no) {
    this->esquerda = no;
}

template <class T> NoGenerico<T> *NoGenerico<T>::getDireita() {
    return this->direita;
}

template <class T> NoGenerico<T> *NoGenerico<T>::getEsquerda() {
    return this->esquerda;
}

