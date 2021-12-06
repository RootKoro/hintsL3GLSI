#include<stdio.h>

void main(){
    int pre , suiv;
    scanf("%i", &pre);
    scanf("%i" , &suiv);

    if (pre >= suiv){
        for(;pre > suiv;){
            pre = suiv;
            scanf("%i", &suiv);
        }
    }
    else if(pre <= suiv){
        for(;pre < suiv;){
            pre = suiv;
            scanf("%i", &suiv);
        }
    }
}