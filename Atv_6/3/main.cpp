#include <iostream>
#include "complexos.hpp"

int main() {
    Complexo a(-3, 4);
    Complexo b(7, 2);
    Complexo sum;
    Complexo sub;
    Complexo mult;

    std::cout << "a = " << a.getReal() << " + " << a.getImaginaria() << "i" << std::endl;
    std::cout << "b = " << b.getReal() << " + " << b.getImaginaria() << "i" << std::endl;

    sum = a + b;
    std::cout << "sum = a + b = " << sum.getReal() << " + " << sum.getImaginaria() << "i" << std::endl;

    sub = a - b;
    std::cout << "sub = a - b = " << sub.getReal() << " + " << sub.getImaginaria() << "i" << std::endl;
    
    mult = a * b;
    std::cout << "mult = a * b = " << mult.getReal() << " + " << mult.getImaginaria() << "i" << std::endl;

    double mod = !a;
    std::cout << "|a| = " << mod << std::endl;
}