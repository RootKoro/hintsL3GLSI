#include<stdio.h>
#include<string.h>

void crypter_caractere(char *, int);

void main(){
    char nom[] = "wewillmeetatmidnigh";
    printf("%s\n",nom);
    crypter_caractere(nom , 11);
}

void crypter_caractere(char * message, int k){
    k %= 26;
    for (int i = 0; i < strlen(message); i++){
        if((int)message[i] <= 91 && (int)message[i] >= 65)
            message[i] = (char) ((int)message[i] + 32);
    }

    for(int i = 0; i < strlen(message); i++){
        if(k > 0){
            if(message[i] >= 97 && message[i] <= 122){
                int container = ((int) message[i] + k) % 122;
                container = container < 97 ? container + 97 : container;
                message[i] = (char) container;
            }
            
        }else{
            if(message[i] >= 97 && message[i] <= 122){
                int container = ((int) message[i] + k);
                container = container < 97 ? 123 - 97 + container : container;
                message[i] = (char) container;
            }
        }
    }
    printf("%s", message);
}