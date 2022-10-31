#include <iostream>
#include <vector>
#include <cstdlib>

#include "complexos.hpp"
using namespace std;

int main() {
  
  int n,i;
  double a,b;
  
  std :: cin >> n; 
  
  std :: vector <Complexo> Lista;
  std :: vector <Complexo>::iterator ptr;
  
  Complexo soma(0,0);
  Complexo aux(0,0);
  
  for(int k = 0 ; k < n ; k++){
    
    srand(i+i*9+2);
    a = rand() / 10;
    srand(i*4+9*i);
    b = rand() / 100;
    aux.setReal(a);
    aux.setImaginaria(b);
    Lista.push_back(aux);
  
  }
  
  for(i = 0 ; i < n ; i++) {
    soma = soma + Lista[i];
  }
    
  
  
  cout << "A soma eh (" << soma.getReal() <<", " << soma.getImaginaria() << ")\n";
  
  Lista.clear();
}