#include<stdio.h>

int crypting(int n){
    int cryptedInversed = 0;

    for(;n;){
        cryptedInversed = (cryptedInversed * 10) + (((n % 10) + 7) % 10);
        n /= 10;
    }

    for(;cryptedInversed;){
        n = n * 10 + cryptedInversed % 10;
        cryptedInversed /= 10;
    }

    int halfPart = n % 100;
    n /= 100;
    cryptedInversed = halfPart * 100 + n;
    return cryptedInversed;
}

int decrypting(int n){
    int crypted = 0;

    for(;n;){
        crypted = (crypted * 10) + ((n + 10 - 7) % 10);
        n /= 10;
        
    }

    for(;crypted;){
        n = n * 10 + crypted % 10;
        crypted /= 10;
    }

    int halfPart = n % 100;
    n /= 100;
    crypted = halfPart * 100 + n;
    return crypted;
}

void main(){
    int nombre, i;
    
    do{
        printf("Entrez un entier de 4 chiffres : ");
        scanf("%i", &nombre);
        if((nombre % 10 == 3)||((nombre / 10) % 10 == 3)){
            printf("Ce nombre entrainera un beug dans l'execution du prgramme.\nReessayer avec un nombre dont les deus derniers chiffres sont differents de troi !\n");
            nombre = 0;
        }
    }while (nombre < 999 || nombre > 9999);

    i = crypting(nombre);
    printf("chiffrement : %i\n", i);

    i = decrypting(i);
    printf("dechiffrement : %i\n", i);
}