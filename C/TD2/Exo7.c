#include<stdio.h>

void main(){
    int nbs[10], max[2], min[2], i = 0;

    printf("Entrez 10 entiers : ");

    for(;i < 10;) //for(initialisation ; condition ; changement) seuls les ';' sont obligatoirs
        scanf("%i", nbs + i++); //nbs + i++ <=> &nbs[i++]

    /*
    for(i = 0; i < 10; i++)
        scanf("%i", &nbs[i]);
    */

    max[0] = min[0] = nbs[0];

    for(i = 0;i < 10;i++)
        if(max[0] < nbs[i])
            max[0] = nbs[i];
        else if(min[0] > nbs[i])
            min[0] = nbs[i];

    max[1] = min[0];
    min[1] = max[0];

    for(--i; i >= 0; i--)/* for(i = 9; i >= 0; i--) */if(max[1] < nbs[i] && nbs[i] != max[0]) max[1] = nbs[i];

    for(++i; i < 10; i++)/* for(i = 0; i < 10; i++) */if(min[1] > nbs[i]) if(nbs[i] != min[0]) min[1] = nbs[i];

    printf("Plus grand : %i\nSecond plus grand : %i\nPlus petit : %i\nSecond plus petit : %i\n", max[0], max[1], min[0], min[1]);
}