#include<stdio.h>
#include<stdlib.h>

void main(){
    printf("Entrer la taille du tableau : ");
    int taille, *tab;
    scanf("%i", &taille);
    tab = (int *) malloc(taille * sizeof(int));
    for(;;){
        char choice;
            int place, val;
        printf("Voulez vous inserer une valeur entre les emplacements 0 et %i?(O/n)  ", taille-1);
        scanf("%c", &choice);

        switch (choice){
        case 'O':
            do{
                printf("Ou voulez vous inserer une valeur?  ");
                scanf("%i", &place);
            }while (place < 0 || place >= taille);
            
            printf("Quelle est la valeur a inserer?  ");
            scanf("%i", &val);
            *(tab + place) = val;
            break;
        
        case 'o':
            do{
                printf("Ou voulez vous inserer une valeur?  ");
                scanf("%i", &place);
            }while (place < 0 || place >= taille);
            
            printf("Quelle est la valeur a inserer?  ");
            scanf("%i", &val);
            *(tab + place) = val;
            break;
        
        case 'n' :
            printf("Bye bye ;-)\n");
            break;
        
        case 'N' :
            printf("Bye bye ;-)\n");
            break;
        
        default:
            break;
        }

        if(choice == 'n' || choice == 'N')
            break;
    }
}