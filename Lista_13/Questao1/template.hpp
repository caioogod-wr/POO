#include <iostream>

template <class T> class Generico {
    T a, b;
    public:
        Generico(T a, T b) {
            this->a = a;
            this->b = b;
        }

        T getMax();
        T getMin();
        T getSum();
};

template <class T> T Generico<T>::getMax() {
    return (this->a > this->b) ? a : b;
}

template <class T> T Generico<T>::getMin() {
    return (this->a < this->b) ? a : b;
}

template <class T> T Generico<T>::getSum() {
    return this->a + this->b;
}