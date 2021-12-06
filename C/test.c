#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

void main(){
    printf("I'm the dad");
    fork();
    printf("I'm a process");
}