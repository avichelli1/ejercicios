#include "ejercicios.h"
#include <iostream>

using namespace std;

bool esPar(int n){
    bool esPar = n % 2 == 0;
    return esPar;
}

bool todosSonPares(vector<int> numeros){
    bool todosPares = true;
    for (int a : numeros){
        if ( esPar(a)) {
            todosPares = todosPares && true;
        } else {
            todosPares = todosPares && false;
        }
    }
    return todosPares;
}

void agregarNumeros(vector<int> &numeros, vector<int> elementosNuevos){
    for (int i = 0; i < elementosNuevos.size(); ++i) {
        numeros.push_back(elementosNuevos[i]);
    }
}

void imprimirValores(vector<int> numeros){
    for (int a : numeros){
        cout << a << endl;
    }
}

void eliminarImpares(vector<int> &numeros){
    vector<int> vectorConPares;
    for (int i = 0; i < numeros.size(); ++i) {
        int valorActual = numeros[i];
        if (esPar(valorActual)){
            vectorConPares.push_back(valorActual);
        }
    }
    numeros.clear();
    agregarNumeros(numeros,vectorConPares);

}

vector<int> eliminarImparesOtraForma(vector<int> numeros){
    vector<int> soloPares;
    for (int i = 0; i < numeros.size(); ++i) {
        int valorActual = numeros[i];
        if (esPar(valorActual)) {
            soloPares.push_back(valorActual);
        }
    }
    return soloPares;
}

void imprimirString(string palabra){
    cout << palabra << endl;
}

void imprimirNumero(int numero){
    cout << numero << endl;
}

void imprimirBool(bool numero){
    cout << numero << endl;
}
