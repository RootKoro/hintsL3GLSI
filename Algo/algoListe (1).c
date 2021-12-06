#define taille 20

struct Etudiant{
	char nom[21], prenom[21];
	int age;
};

typedef struct Etudiant Etudiant;

struct listeStatique{
	Etudiant listeEt[taille];
	int longueur;
};

typedef struct listeStatique listeStatique;

listeStatique listevide();
listeStatique cons(listeStatique,Etudiant);
listeStatique fin(listeStatique);
Etudiant premier(listeStatique);

listeStatique listevide(){
	listeStatique list;
	list.longueur = 0;
	return list;
}

listeStatique cons(listeStatique list,Etudiant et){
	list.longueur++;
	list.listeEt[list.longueur]=et;
	return list;
}

listeStatique fin(listeStatique l){
	if(l.longueur > 0){
		l.longueur--;
		return l;
	}
	puts("La liste est vide");
	return l;
}

Etudiant premier(listeStatique l){
	if(l.longueur > 0){
		return l.listeEt[l.longueur];
	}
	puts("La liste est vide");
	return;
}