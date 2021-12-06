#include<stdio.h>
#include<string.h>

void crypting(int * toEncrypt){
    for(int i = 3; i >= 0; i--)   toEncrypt[i] = (toEncrypt[i] + 7) % 10;

    for(int i = 3; i > 1; i--){
        int ech = toEncrypt[i];
        toEncrypt[i] = toEncrypt[i-2];
        toEncrypt[i-2] = ech;
    }
}

void decrypting(int * crypted){

    for(int i = 3; i >= 0; i--) crypted[i] += 10 - 7;

    for(int i = 0; i < 2; i++){
        int ech = crypted[i];
        crypted[i] = crypted[i+2];
        crypted[i+2] = ech;
    }

    for(int i = 0; i < 4; i++)  if(crypted[i] >= 10) crypted[i] -= 10;
}

void main(){
    char nombre[100];
    int chiffres[4], i = 0;

    do{
        printf("Entrez un nombre de 4 chiffres : ");
        scanf("%s", nombre);
    }while (strlen(nombre) > 4 || strlen(nombre) < 4);
    
    for(;i < strlen(nombre);i++) chiffres[i] = (int)nombre[i] - 48;
    
    crypting(chiffres);
    
    for(i = 0; i < 4 ; i++) printf("%i", chiffres[i]);
    
    printf("\n");
    decrypting(chiffres);
    
    for(i = 0; i < 4 ; i++) printf("%i", chiffres[i]);
}