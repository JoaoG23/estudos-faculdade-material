#include <stdio.h>
#include <stdlib.h>

int main() {
    setlocale(LC_ALL, "");

    printf("Olá mundo!");

    int valor1 = 10;
    int valor2 = 20;
    int resultado = valor1 + valor2;

    float preco = 10.50;

    preco = preco * 1.1;

    return 0;
}