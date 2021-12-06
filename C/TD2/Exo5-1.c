#include<stdio.h>
#include<string.h>

void main(){
    char nombre[100];

    do{
        printf("Entrez un nombre de 5 chiffres : ");
        scanf("%s", nombre);
    }while (strlen(nombre) > 5 || strlen(nombre) < 5);
    
    for(int i = 0; i < strlen(nombre) - 1; i++)
        printf("%i, ", (int)nombre[i] - 48);
        printf("%i\n", (int)nombre[4] - 48);
}