#include <vector>
#include <iostream>
#include "ejercicios.h"

using namespace std;

int main() {

    vector<int> a;
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);
    imprimirValores(a);
    
    a.pop_back();
    a.pop_back();
    imprimirValores(a);


    return 0;
}
