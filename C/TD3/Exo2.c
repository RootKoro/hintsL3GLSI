#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void main(){
    int inf, sup, nombreTotalDeTentative;
    
    printf("Entrez la borne inf et la borne sup : ");
    scanf("%i%i", &inf, &sup);

    printf("Entrez le nombre de tentatives : ");
    scanf("%i", &nombreTotalDeTentative);
    
    srand(time(NULL));
    
    int nombreSurprise = rand() % (sup - inf + 1) + inf , devin;

    for(int nombreDeTentative = 1; nombreDeTentative <= nombreTotalDeTentative;nombreDeTentative++){
        printf("Tentative %d : ", nombreDeTentative);
        scanf("%i", &devin);
        if(devin == nombreSurprise){
            printf("Niiiiiiiice, vous avez trouvei en %d essais !!!!", nombreDeTentative);
            break;
        }else{
            if(nombreTotalDeTentative - nombreDeTentative){
                if(devin > nombreSurprise)
                    printf("nope, c\'est moins, il vous reste %d tentatives !\n", nombreTotalDeTentative - nombreDeTentative);
                else
                    printf("nope, c\'est plus, il vous reste %d tentatives !\n", nombreTotalDeTentative - nombreDeTentative);
            }else
                printf("Dommage il ne vous reste plus de tentative...");
        }
    }
}