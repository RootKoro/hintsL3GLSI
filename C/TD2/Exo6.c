#include<stdio.h>

void main(){
    printf("number   square   cube\n");

    for (int i=0; i < 11; i++)
        if(i < 3)
            printf("%i %8i %8i\n", i, i * i, i * i * i);
        else if (i == 3)
            printf("%i %8i %9i\n", i, i * i, i * i * i);
        else if (i == 4)
            printf("%i %9i %8i\n", i, i * i, i * i * i);
        else if (i > 4 && i < 10)
            printf("%i %9i %9i\n", i, i * i, i * i * i);
        else if (i == 10)
            printf("%i %9i %9i\n", i, i * i, i * i * i);
}