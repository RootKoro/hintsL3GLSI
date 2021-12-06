#include<stdio.h>

void main(){
    int nbr, i = 4, chiffre[5];

    do{
        printf("Entrez un entier de 5 chiffres : ");
        scanf("%i", &nbr);
    }while (nbr =< 9999 ||  nbr >= 100000);

    for(;nbr > 0;i--){          //for(init ; cond ; change)
        chiffre[i] = nbr%10;    // chiffre[i] = chiffre[4] = nbr % 10 => chiffre[i] = chiffre[3] => ...
        nbr /= 10;              //
    }

    for(i =0;i<5;i++)
        printf("%i , ", chiffre[i]);
}

/*
nbr = 12345

12345 % 10 = 5

chiffre[4] = 5

12345 / 10 = 1234

nbr = 1234

1234 % 10 = 4

chiffre[3] = 4


...

chiffre[0] = 1

1 , 2 , 3 , 4 , 5

*/