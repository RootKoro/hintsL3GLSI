#include<stdio.h>

void main(){
    int pre, suiv;
    scanf("%i", &pre);
    scanf("%i" , &suiv);

    if(pre >= suiv){
        start:{
            scanf("%d", &suiv);
            if (suiv <= pre){
                pre = suiv;
                goto start;
            }
        }
    } else if(pre <= suiv){
        continu:{
            scanf("%d", &suiv);
            if (suiv >= pre){
                pre = suiv;
                goto continu;
            }
        }
    }    
}