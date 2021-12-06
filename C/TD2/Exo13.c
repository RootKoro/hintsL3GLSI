#include<stdio.h>

void main(){
    int puissance = 1;

    while (puissance){
        puissance *= 3;
        printf("%i , ", puissance);
    }
    
}

//le programme entraine une boucle infinie!