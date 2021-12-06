-- question 1 :
--____________
-----------creation des BD-----------------
CREATE DATABASE G_Referenciel;
CREATE DATABASE G_EmploiDuTemps;
CREATE DATABASE G_AffectationEnseignement;
CREATE DATABASE G_Notes;
CREATE DATABASE G_Absences;

------creation de tables de g_absence--------
use G_Absences
CREATE TABLE Absence(
    IdAbsence INT PRIMARY KEY,
    EtatJustification BOOLEAN,
    DateAbsence DATE
);

-----creation des tables de g_notes----------
use G_Notes
CREATE TABLE EvaluationEtudiant(
    PreDS INT NOT NULL,
    DS INT NOT NULL,
    Moyenne INT NOT NULL,
    idEvaluation INT PRIMARY KEY
);

----creation de tables de g_emploidutemps------
CREATE TABLE Seance(
    idSeance INT PRIMARY KEY,
    JourSemaine int not null,
    HeureDeb time not null,
    HeureFin time not NULL,
    TypeSeance int,
    IdAbsence int FOREIGN KEY
    REFERENCES Absence(IdAbsence)
);
use G_EmploiDuTemps
CREATE TABLE EmploiDuTemps_Classe(
    idEDT INT PRIMARY KEY,
    Semestre INT NOT NULL,
    idSeance int FOREIGN KEY
    REFERENCES Seance(idSeance)
);

--creation de tables de g_affectationenseignant--
use G_AffectationEnseignement
CREATE TABLE AffectationEnseignement(
    idAffectation INT PRIMARY KEY,
    Etatvalidation BOOLEAN,
    idSeance int FOREIGN KEY
    REFERENCES Seance(idSeance),
    idEvaluation int FOREIGN KEY
    REFERENCES EvaluationEtudiant(idEvaluation)
);

-----creation des tables de g_referenciel------
USE G_Referenciel
CREATE TABLE Inscription(
    NumInsc INT PRIMARY KEY,
    DateInscription DATE NOT NULL,
    idEvaluation int FOREIGN KEY 
    REFERENCES EvaluationEtudiant(idEvaluation),
    IdAbsence INT FOREIGN KEY
    REFERENCES Absence(IdAbsence)
);
CREATE TABLE AnneeAcademique(
    AnneeDebut INT NOT NULL,
    AnneeFin INT NOT NULL,
    NumInsc INT FOREIGN KEY 
    REFERENCES Inscription(NumInsc),
    idEDT INT FOREIGN KEY
    REFERENCES EmploiDuTemps_Classe(),
    idAffectation INT FOREIGN KEY
    REFERENCES AffectationEnseignement(idAffectation)
);
CREATE TABLE Matiere(
    CodeMatiere INT PRIMARY KEY,
    LibelleMatiere VARCHAR(255) NOT NULL,
    nbHeureCM INT NOT NULL,
    nbHeureTD INT NOT NULL,
    CoefMatiere INT NOT NULL,
    idAffectation int FOREIGN KEY
    REFERENCES AffectationEnseignement(idAffectation)
);
CREATE TABLE UE(
    CodeUE INT PRIMARY KEY,
    LibelleUE VARCHAR(255) NOT NULL,
    CoefUE INT NOT NULL,
    NbCredit INT NOT NULL,
    CodeMatiere int FOREIGN KEY
    REFERENCES Matiere(CodeMatiere)
);
CREATE TABLE Classe(
    CodeClasse INT PRIMARY KEY,
    Libelle VARCHAR(255) NOT NULL,
    Niveau INT NOT NULL
    NumInsc int FOREIGN KEY 
    REFERENCES Inscription(NumInsc),
    idEDT int FOREIGN KEY
    REFERENCES EmploiDuTemps_Classe(idEDT),
    CodeUE int FOREIGN KEY
    REFERENCES UE(CodeUE)
);
CREATE TABLE Formation(
    CodeFormation INT PRIMARY KEY,
    Libelle VARCHAR(255) NOT NULL,
    AnneeCreation INT NOT NULL,
    CodeClasse INT FOREIGN KEY
    REFERENCES Classe(CodeClasse)
);
CREATE TABLE Grade(
    CodeGrade INT PRIMARY KEY,
    LibelleGrade VARCHAR(255) NOT NULL,
    MatriculeProf int FOREIGN KEY
    REFERENCES Prof(Matricule)
);
CREATE TABLE Prof(
    Matricule INT PRIMARY KEY,
    CIN INT NOT NULL,
    Nom VARCHAR(75) NOT NULL,
    Prenom VARCHAR(150) NOT NULL
    idAffectation int FOREIGN KEY 
    REFERENCES AffectationEnseignement(idAffectation)
);
CREATE TABLE Etudiant(
    INE INT PRIMARY KEY,
    nom VARCHAR(75) NOT NULL,
    Prenom VARCHAR(150) NOT NULL,
    DateNaisse DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    NumInsc int FOREIGN KEY
    REFERENCES Inscription(NumInsc)
);