#include <iostream>
#include "template.hpp"

int main() {
    Generico <int> objeto(2, 7);

    std::cout << "Maior: " << objeto.getMax() << std::endl;
    std::cout << "Menor: " << objeto.getMin() << std::endl;
    std::cout << "Soma: " << objeto.getSum() << std::endl;

    return 0;
}
