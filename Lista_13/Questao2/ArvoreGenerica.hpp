#include <iostream>
#include "NoGenerico.hpp"

template <class T> class ArvoreGenerica {
    NoGenerico<T> *raiz;
    int numeroNos;

    public:
        ArvoreGenerica() {
            raiz = nullptr;
            numeroNos = 0;
        }

        void adiciona(T valor);
        void remove(T valor);
        NoGenerico<T> *busca(T valor);
        void imprimeEmOrdem();
    
    void imprimeEmOrdemRecursivo(NoGenerico<T> *no);
    bool confereArvoreVazia();
    NoGenerico<T> *encontraMaiorNoRamo(NoGenerico<T> *no);
};

template <class T> bool ArvoreGenerica<T>::confereArvoreVazia() {
    if(raiz == nullptr)  {
        std::cout << "Arvore vazia" << std::endl;
        return true;
    }
    return false;
}

template <class T> void ArvoreGenerica<T>::adiciona(T valor) {
    NoGenerico<T> *novoNo = new NoGenerico(valor);

    if(raiz == nullptr) {
        raiz = novoNo;
        return;
    }

    NoGenerico<T> *no_aux = raiz;
    NoGenerico<T> *no_prev = nullptr;
    while(no_aux != nullptr) {
        no_prev = no_aux;
        if(no_aux->EhMaior(valor) == 1) {
            no_aux = no_aux->getEsquerda();
            continue;
        }
        no_aux = no_aux->getDireita();
    }

    if(no_prev->EhMaior(valor) == 1) {
        no_prev->setEsquerda(novoNo);
    } else {
        no_prev->setDireita(novoNo);
    }
}

template <class T> void ArvoreGenerica<T>::imprimeEmOrdemRecursivo(NoGenerico<T> *no) {
    if(no == nullptr)
        return;

    imprimeEmOrdemRecursivo(no->getEsquerda());
    std::cout << no->getValor() << std::endl;
    imprimeEmOrdemRecursivo(no->getDireita());
}

template <class T> void ArvoreGenerica<T>::imprimeEmOrdem() {
    if(confereArvoreVazia())        
        return;

    imprimeEmOrdemRecursivo(raiz);
}

template <class T> NoGenerico<T> *ArvoreGenerica<T>::busca(T valor) {
    if(confereArvoreVazia())        
        return nullptr;

    NoGenerico<T> *no_aux = raiz;
    while(no_aux != nullptr && no_aux->getValor() != valor) {
        if(no_aux->EhMaior(valor) == 1) {
            no_aux = no_aux->getEsquerda();
            continue;
        }
        no_aux = no_aux->getDireita();
    }

    if(no_aux == nullptr)
        std::cout << "No nao encontrado na busca" << std::endl;

    return no_aux;
}

// Encontra o nó com maior valor em um ramo da árvore, sendo o parâmetro "no" a raíz do ramo
template <class T> NoGenerico<T> *ArvoreGenerica<T>::encontraMaiorNoRamo(NoGenerico<T> *no) {
    NoGenerico<T> *no_aux = no;
    NoGenerico<T> *no_prev = nullptr;
    if(no->getDireita() == nullptr)
        return nullptr;
    while(no_aux->getDireita() != nullptr) {
        no_prev = no_aux;
        no_aux = no_aux->getDireita();
    }
    no_prev->setDireita(no_aux->getEsquerda());
    return no_aux;
}

template <class T> void ArvoreGenerica<T>::remove(T valor) {
    if(confereArvoreVazia())        
        return;

    NoGenerico<T> *no_aux = raiz;
    NoGenerico<T> *no_prev = nullptr;
    while(no_aux != nullptr && no_aux->getValor() != valor) {
        no_prev = no_aux;
        if(no_aux->EhMaior(valor) == 1) {
            no_aux = no_aux->getEsquerda();
            continue;
        }
        no_aux = no_aux->getDireita();
    }

    if(no_aux == nullptr) {
        std::cout << "No nao encontrado para remocao" << std::endl;
        return;
    }

    NoGenerico<T> *NoDeslocado;
    if(no_aux == raiz) {
        if(no_aux->getEsquerda() == nullptr) {
            raiz = no_aux->getDireita();
            NoDeslocado = nullptr;
        }
        else {
            raiz = encontraMaiorNoRamo(no_aux->getEsquerda());
            NoDeslocado = raiz;
            if(NoDeslocado == nullptr) {
                raiz = no_aux->getEsquerda();
                raiz->setDireita(no_aux->getDireita());
            }
        }    
    }

    else {
        if(no_prev->EhMaior(valor) == 1) {
            if(no_aux->getEsquerda() == nullptr) {
                no_prev->setEsquerda(no_aux->getDireita());
                NoDeslocado = nullptr;
            }
            else {
                no_prev->setEsquerda(encontraMaiorNoRamo(no_aux->getEsquerda()));
                NoDeslocado = no_prev->getEsquerda();
                if(NoDeslocado == nullptr) {
                    no_prev->setEsquerda(no_aux->getEsquerda());
                    no_prev->getEsquerda()->setDireita(no_aux->getDireita());
                }
            }    
        }
        else {
            if(no_aux->getEsquerda() == nullptr) {
                no_prev->setDireita(no_aux->getDireita());
                NoDeslocado = nullptr;
            }
            else {
                no_prev->setDireita(encontraMaiorNoRamo(no_aux->getEsquerda()));
                NoDeslocado = no_prev->getDireita();
                if(NoDeslocado == nullptr) {
                    no_prev->setDireita(no_aux->getEsquerda());
                    no_prev->getDireita()->setDireita(no_aux->getDireita());
                }
            }
        }
    }

    if(NoDeslocado != nullptr) {        
        NoDeslocado->setEsquerda(no_aux->getEsquerda());
        NoDeslocado->setDireita(no_aux->getDireita());
    }

    delete no_aux;
}