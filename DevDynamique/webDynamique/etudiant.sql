create database etudiant;
	use etudiant;
create table identification (
nom varchar(20), 
prenoms varchar(50),
civilite varchar(10), 
date_naissance date, 
lieu_naissance varchar(20), 
cni int(11),
ine varchar(18), 
num_carte int(11), 
pays_naissance varchar(10), 
nationalite varchar(10)
);
create table adresse(
adresse_principale varchar(20), 
adresse_secondaire varchar(20), 
email varchar(20), 
tel_portable  varchar(20), 
tel_fixe varchar(20), 
email_personnel varchar(20), 
email_institutionnel varchar(20), 
boite_postale int(11)
);

create table emploi(
activite_salarie varchar(20), 
statut étudiant varchar(20), 
categorie_socio varchar(20)

);
create table situation(
situation_matrimoniale varchar(20), 
nb_enfants int(11)
);
create table bourse(
bourse varchar(20), 
nature_bourse varchar(20), 
montant_bourse int(11)
);
create table contact(
nom varchar(20), 
prenoms varchar(20), 
adresse varchar(20), 
ville varchar(20), 
tel_portable  varchar(20), 
tel_fixe varchar(20),
email_personnel varchar(20) , 
boite_postale int(11), 
fax int(11), 
responsable_etudiant varchar(20), 
personne_contacter varchar(20)
);