#include <iostream>
#include "complexos.hpp"

int main() {
    Complexo a(-3, 4);
    std::cout << "|" << a.getReal() << " + " << a.getImaginaria() << "i| = " << a.modulo() << std::endl;

    Complexo b(7, 2);
    Complexo sum(0, 0);
    Complexo sub(0,0);
    Complexo mult(0,0);

    sum = a.soma(b);
    std::cout << "sum = (" << a.getReal() << " + " << a.getImaginaria() << "i) + (" << b.getReal() << " + " << b.getImaginaria() << "i) = " << sum.getReal() << " + " << sum.getImaginaria() << "i" << std::endl;

    sub = a.subtracao(b);
    std::cout << "sub = (" << a.getReal() << " + " << a.getImaginaria() << "i) - (" << b.getReal() << " + " << b.getImaginaria() << "i) = " << sub.getReal() << " + " << sub.getImaginaria() << "i" << std::endl;

    mult = a.multiplicacao(b);
    std::cout << "mult = (" << a.getReal() << " + " << a.getImaginaria() << "i) * (" << b.getReal() << " + " << b.getImaginaria() << "i) = " << mult.getReal() << " + " << mult.getImaginaria() << "i" << std::endl;
    std::cout << "|" << mult.getReal() << " + " << mult.getImaginaria() << "i| = " << mult.modulo() << std::endl;
}