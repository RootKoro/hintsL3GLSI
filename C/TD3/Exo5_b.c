#include<stdio.h>

void main(){
    int n;

    printf("Taille du nombre de diamant a dessiner : ");
    scanf("%i", &n);

    if(n % 2){
        for(int i = 0; i < n; i++){
            int starPrinter;
            if(i <= n/2){
                starPrinter = n/2 - i;
                for(int j = 0; j < n; j++){
                if(j < starPrinter)
                    printf(" ");
                else if(j <= starPrinter + 2*i && j >= starPrinter)
                    printf("*");
                }
            }
            else{
                starPrinter = i - n/2;
                for(int j = 0; j < n; j++){
                    if(j < starPrinter)
                        printf(" ");
                    else if(j <= n - starPrinter - 1 && j >= starPrinter)
                        printf("*");
                }
            }
            printf("\n");
        }
    }else{
        for(int i = 0; i < n; i++){
            int starPrinter;
            if(i <= n/2){
                starPrinter = n/2 - i - 1;
                for(int j = 0; j < n - 1; j++){
                if(j < starPrinter)
                    printf(" ");
                else if(j <= starPrinter + 2*i && j >= starPrinter)
                    printf("*");
                }
            }
            else{
                starPrinter = i - n/2;
                for(int j = 0; j < n - 1; j++){
                    if(j < starPrinter)
                        printf(" ");
                    else if(j <= n - 1 - starPrinter - 1 && j >= starPrinter)
                        printf("*");
                }
            }
            printf("\n");
        }
    }
}