#include <iostream>
#include "ArvoreGenerica.hpp"

using namespace std;

int main() {
    ArvoreGenerica<string> *arvore = new ArvoreGenerica<string>();
    
    arvore->imprimeEmOrdem();

    string palavra;
    palavra = "alo";
    arvore->adiciona(palavra);
    palavra = "salve";
    arvore->adiciona(palavra);
    palavra = "etcha";
    arvore->adiciona(palavra);
    palavra = "bom dia";
    arvore->adiciona(palavra);
    palavra = "violao";
    arvore->adiciona(palavra);
    palavra = "computador";
    arvore->adiciona(palavra);
    palavra = "chave";
    arvore->adiciona(palavra);
    palavra = "jogo";
    arvore->adiciona(palavra);
    palavra = "dia";
    arvore->adiciona(palavra);
    palavra = "pais";
    arvore->adiciona(palavra);
    palavra = "trabalho";
    arvore->adiciona(palavra);
    palavra = "exercicio";
    arvore->adiciona(palavra);


    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    // NoGenerico<string> *palavra2 = arvore->busca("salve");
    // if(palavra2->getEsquerda() != nullptr)
    //     cout << "No a esquerda de " << palavra2->getValor() << ": " << palavra2->getEsquerda()->getValor() << endl;
    // cout << "-------------------" << endl;

    cout << "Removendo bom dia" << endl;
    arvore->remove("bom dia");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo jogo" << endl;
    arvore->remove("jogo");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo exercicio" << endl;
    arvore->remove("exercicio");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo violao" << endl;
    arvore->remove("violao");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo computador" << endl;
    arvore->remove("computador");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo alo" << endl;
    arvore->remove("alo");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo etcha" << endl;
    arvore->remove("etcha");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo chave" << endl;
    arvore->remove("chave");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo dia" << endl;
    arvore->remove("dia");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo trabalho" << endl;
    arvore->remove("trabalho");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo salve" << endl;
    arvore->remove("salve");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    cout << "Removendo pais" << endl;
    arvore->remove("pais");

    cout << "Imprimindo em ordem" << endl;
    arvore->imprimeEmOrdem();
    cout << "-------------------" << endl;

    delete arvore;
    return 0;
}