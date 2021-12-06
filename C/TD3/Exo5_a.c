#include<stdio.h>

void main(){
    for(int i = 0; i < 9; i++){
        int starPrinter;
        if(i < 5){
            starPrinter = 5 - i - 1;
            for(int j = 0; j < 9; j++){
            if(j < starPrinter)
                printf(" ");
            else if(j <= starPrinter + 2*i && j >= starPrinter)
                printf("*");
            }
        }
        else{
            starPrinter = i - 5 + 1;
            for(int j = 0; j < 9; j++){
                if(j < starPrinter)
                    printf(" ");
                else if(j <= 9 - starPrinter - 1 && j >= starPrinter)
                    printf("*");
            }
        }
        printf("\n");
    }
}