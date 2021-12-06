#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/*
sur un SE 64 bits (int  = 4 bits , char  = 1 bit , short = 2 bits , long = 8 bits, double = 8bits float = 8bits)
sur un SE 32 bits (int  = 2 bits , char  = 1 bit , short = 2 bits , long = 8 bits, double = 8bits float = 8bits)

1ere partie : Pointeur

Comment declarer un pointeur ?
    <type_variable_pointée> * <nom_pointeur>;

Comment initialiser un pointeur ?
    _<type_variable_pointée> * <nom_pointeur> = &<variable_pointée>;
    _<type_variable_pointée> * <nom_pointeur>;
    <nom_pointeur> = &<variable_pointée>;

Notions importantes : 

    _*pointeur <hors de la déclaration> => la variable pointée

    _ pointeur ===> valeur de pointeur ===> adresse de la variable pointée
    
    _&pointeur ========> reference à l'adresse du pointeur !

    // a et b sont des pointeurs ==> *a et *b sont des references à des variables !

2eme partie : Strings

Qu'est ce qu'une chaine de caractère ?
    Une chaine de caractère c'est un tableau de caractère

Comment déclarer une chaine de caractère ?
    _char <nom_variable>[taille];
    _char * <nom_vaiable>;

Comment initialiser notre chaine de caractere ?
    _char <nom_variable>[taille] = "chaine de caractere";
    _char <nom_variable>[] = "chaine de caractere";
    _char <nom_variable>[taille];
        strcpy(<nom_variable> , "chaine de caractere");
    _char * <nom_vaiable>;
        *<nom_variable> = "chaine de caractere";




*/

int main(int argc, char const *argv[])
{
    return 0;
}
