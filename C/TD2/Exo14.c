#include<stdio.h>

int crypting(int n){
    int chiffres[4], i = 4;
    
    for(;n;i--){
        chiffres[i-1] = n % 10;
        n /= 10;
    }

    for(; i < 4;i++)    chiffres[i] = (chiffres[i] + 7) % 10;

    for(i = 0; i < 2;i++){
        int ech = chiffres[i];
        chiffres[i] = chiffres[i+2];
        chiffres[i+2] = ech;
    }
    
    for(i = 0; i < 4; i++)  n = n * 10 + chiffres[i];

    return n;
}

/*

[3 , 6 , 9 , 8]

n = 0

n = 0 * 10 + 3 = 3

n = 3 * 10 + 6 = 36

n = ...

n = 3698

*/


int decrypting(int n){
    int chiffres[4], i=4;

    for(;n;i--){
        chiffres[i-1] = n % 10;
        n /= 10;
    }

    for(; i < 4;i++)    chiffres[i] += 10 - 7;

    for(i = 0; i < 2;){
        int ech = chiffres[i];
        chiffres[i] = chiffres[i+2];
        chiffres[i++ +2] = ech;
    }

    for(i = 0; i < 4; i++)  if(chiffres[i] > 9)    chiffres[i] %= 10;
    
    for(i = 0; i < 4; i++)  n = n * 10 + chiffres[i];

    return n;
}

void main(){
    int nombre, i;
    
    do{
        printf("Entrez un entier de 4 chiffres : ");
        scanf("%i", &nombre);
    }while (nombre < 999 || nombre > 9999);

    i = crypting(nombre);
    printf("%i\n", i);

    i = decrypting(i);
    printf("%i\n", i);
}