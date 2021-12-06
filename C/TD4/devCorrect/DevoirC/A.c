#include<stdio.h>

void move_to(int *, int, int);

void main(){
    int t[] = {22,33,44,55,66,77,88,99};
    for(int i = 0; i < 8; i++)
        printf("%d ", t[i]);
    printf("\n");
    move_to(t , 8 , 3);
    for(int i = 0; i < 8; i++)
        printf("%d ", t[i]);
}

void move_to(int * t, int n, int k){
    for(int i = 0; i < k; i++){
        int ext = t[n-1];
        for(int j = n - 1; j > 0; j--){
            t[i]= t[i-1];
        }
        t[0] = ext;
    }
}