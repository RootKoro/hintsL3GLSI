#include<stdio.h>

void main(){
    int nbs[3], max, min, sum = 0, prod = 1, i=0;

    printf("Entrez trois nombres : ");
    scanf("%i%i%i", nbs, nbs + 1, nbs + 2);
    max = min = nbs[0];

    for (;i<3;i++){
        if(max < nbs[i])
            max = nbs[i];
        
        if(min > nbs[i])
            min = nbs[i];
        
        sum += nbs[i];
        prod *= nbs[i];
    }

    float avg = sum / 3.0;

    printf("\nSomme =  %i\nProduit =  %i\nMoyenne = %1.2f\nMax = %i\nMin = %i\n", sum, prod, avg, max, min);
}