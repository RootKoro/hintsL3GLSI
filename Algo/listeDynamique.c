#include<stdio.h>
#include<stdlib.h>

typedef struct Student {
	char *nom, *prenom;
	int age;
    
} Etudiant;

typedef struct dynamicList {
	Etudiant Et;
    listeDynamique suiv;
    int longueur;
} listeDynamique;

listeDynamique listeVide();
listeDynamique cons(listeDynamique,Etudiant);
Etudiant tete(listeDynamique);
listeDynamique fin(listeDynamique);

/* listeDynamique listeVide(){
    listeDynamique l;
    l.longueur = 0;
    return l;
}

listeDynamique cons(listeDynamique l, Etudiant et){
    if(l.longueur > 0)
        et.etSuiv = &l.Et;
    else
        et.etSuiv = NULL;
    l.Et = et;
    l.longueur++;
    return l;
}

Etudiant tete(listeDynamique l){
    return l.Et;
}

listeDynamique fin(listeDynamique l){

} */

/* void showLast(dynamicList d){
    printf("\n%s %s %d\n\n", d.student->firstName, d.student->surName , d.student->age);
} */

/* dynamicList add(dynamicList d, Student *s){
    d.student->previousStudent = d.student;
    d.student = s;
    return d;
} */

/* dynamicList dropLast(dynamicList d){
    d.student = d.student->previousStudent;
    d.student->previousStudent = d.student->previousStudent -> previousStudent;
    return d;
} */

/* void main(){
    dynamicList studentList;
    Student student;
    studentList.student->age = 20;
    studentList.student->firstName = "Cyr Mathieu";
    studentList.student->surName = "GUEYE";
    studentList.student->previousStudent = &student;

    while(1){
        printf("1 - Afficher la tete\n");
        printf("2 - Supprimer la tete\n");
        printf("3 - Inserer a la tete\n");
        printf("Autre pour quitter\n");
        printf("Choisissez : ");
        int choix;
        scanf("%d", &choix);
        int choice = 0;
        switch (choix)
        {
        case 1:
            showLast(studentList);
            break;
        
        case 2:
            studentList = dropLast(studentList);
            printf("\nle dernier etudiant de la liste a bien ete supprimei\n\n");
            break;
        
        case 3:
            printf("Nom de l'etudiant : ");
            scanf("%s", &(student.surName));
            printf("Prenom de l'etudiant : ");
            scanf("%s", &(student.firstName));
            printf("Age de l'etudiant : ");
            scanf("%s", &student.age);
            student.previousStudent = studentList.student;
            studentList = add(studentList, &student);
            break;
        
        default:
            choice = 1;
            break;
        }

        if (choice == 1)
            break;
    }
} 


1       2       3       4       5       6       7       8       9

e1e2    e2e3    e3e4    e4e5    e5e6    e6e7    e7e8    e8e9    e9


t[1] = e1

t[2] = e2

t[3] = e3

t[4] = e4

...

t[8] = e8

t[9] = e9

*/