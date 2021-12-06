DROP DATABASE IF EXISTS tp_php;

CREATE DATABASE tp_php;
USE tp_php

CREATE TABLE adresseActuelle(
    adressePrincipale varchar(510) not null,
    adresseSecondaire varchar(510),
    emailPersonnel varchar(100) unique not null,
    emailInstitutionnel  varchar(100),
    telephonePortable varchar(20) unique not null,
    telephoneFixe varchar(20) not null,
    boitePostal varchar(20),
    CONSTRAINT pk_adresseActuelle PRIMARY KEY(emailInstitutionnel)
);

CREATE TABLE emploi(
    matricule int auto_increment,
    activiteSalarier boolean,
    statutEtudiant varchar(255),
    categorieSocioPro varchar(255),
    CONSTRAINT pk_emploi PRIMARY KEY(matricule)
);

CREATE TABLE situationFamiliale(
    matricule int auto_increment,
    situationMatrimoniale varchar(255) not null,
    nombreEnfant tinyint not null,
    CONSTRAINT pk_situationFamiliale PRIMARY KEY(matricule)
);

CREATE TABLE bourse(
    matricule int auto_increment,
    bourse varchar(255) not null,
    natureBourse varchar(255),
    montantBourse int,
    CONSTRAINT pk_bourse PRIMARY KEY(matricule)
);

CREATE TABLE contact(
    nom varchar(255) not null,
    prenom varchar(255) not null,
    adresse varchar(255) not null,
    ville varchar(255),
    telephonePortable varchar(20) not null,
    telephoneFixe varchar(20) not null,
    emailPersonnel varchar(100),
    boitePostal varchar(20),
    fax  varchar(30),
    responsableEtudiant varchar(10) not null,
    personneAContacter varchar(10) not null,
    CONSTRAINT pk_contact PRIMARY KEY(emailPersonnel)
);

CREATE TABLE identification(
    nom varchar(255) not null,
    prenom varchar(255) not null,
    civilite varchar(5) not null,
    dateDeNaissance date not null,
    lieuDeNaissance varchar(255) not null,
    CNI bigint not null,
    INE varchar(255),
    numeroCarteEtudiant bigint,
    paysDeNaissance varchar(255),
    nationalite varchar(255),
    adresse varchar(100) not null,
    emploi int,
    situationFamiliale int not null,
    bourse int not null,
    contact varchar(100) not null,
    CONSTRAINT pk_identification PRIMARY KEY(numeroCarteEtudiant),
    CONSTRAINT fk_identification_adresse FOREIGN KEY(adresse) REFERENCES adresseActuelle(emailInstitutionnel),
    CONSTRAINT fk_identification_emploi FOREIGN KEY(emploi) REFERENCES emploi(matricule),
    CONSTRAINT fk_identification_situationFamiliale FOREIGN KEY (situationFamiliale) REFERENCES situationFamiliale(matricule),
    CONSTRAINT fk_identification_bourse FOREIGN KEY(bourse) REFERENCES bourse(matricule),
    CONSTRAINT fk_identification_contact FOREIGN KEY(contact) REFERENCES contact(emailPersonnel)
);