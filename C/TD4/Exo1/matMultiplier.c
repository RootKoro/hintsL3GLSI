#include<stdio.h>

void main(){
    char tailleMatrices[4], tailleTableaux[4];
    int matLength1, matLength2, tabLength1, tabLength2;
    do{
        printf("les matrices ont elles la meme taille? (Oui/non)  ");
        scanf("%s", tailleMatrices);
    } while (tailleMatrices != "Oui" || tailleMatrices != "non");

    do{
        printf("les tableaux ont ils la meme taille? (Oui/non)  ");
        scanf("%s", tailleTableaux);
    } while (tailleTableaux != "Oui" || tailleTableaux != "non");
    
    if(tailleMatrices == "Oui" && tailleTableaux == "non"){
        printf("Donnez la taille des tableaux : ");
        scanf("%i", &tabLength1);
        printf("Donnez la taille des matrices : ");
        scanf("%i", &matLength1);
        int *tab1 = (int*) malloc(tabLength1 * sizeof(int));
        int *tab2 = (int*) malloc(tabLength1 * sizeof(int));
        int *mat1 = (int*) malloc(matLength1 * sizeof(tab1));
        int *mat2 = (int*) malloc(matLength1 * sizeof(tab2));
    }else if(tailleMatrices == "Oui" && tailleTableaux == "non"){
        //
    }
    
}