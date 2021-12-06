#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main(){
    printf("Taille de votre mot : ");
    int length;
    scanf("%i", &length);
    char *word = (char *) malloc(++length * sizeof(char)), ref[256];
    printf("Donner votre mot et on l'analyse pour vous : ");
    scanf("%s", word);

    for (int i = 0; i < 255;)
        ref[i] = (char) (++i);

    for(int j = 0; j < 255; j++){
        int compteurOccurence = 0;
        
        for(int i = 0; i < length - 1; i++){
            if(word[i] == ref[j])
                compteurOccurence++;
        }

        if(compteurOccurence != 0)
            printf("%c : %i\n", ref[j], compteurOccurence);
    }
}