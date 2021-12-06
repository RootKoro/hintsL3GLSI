<?php
require('.conf.php');
require('Identification.php');
require('Adresse.php');
require('Emploi.php');
require('SituationFamiliale.php');
require('Bourse.php');
require('Contact.php');

$error = "Veuillez remplir tous les champs obligatoires !";

if (empty($_POST["nom"]) || empty($_POST["prenom"]) || empty($_POST["datenaissance"]) || empty($_POST["lieunaissance"]) || empty($_POST["CNI"]) || empty($_POST["numerocarteetdiant"])  || empty($_POST["adresseprincipale"]) || empty($_POST["mailP"]) || empty($_POST["mailI"]) || empty($_POST["telephoneP"]) || empty($_POST["telephoneF"]) || empty($_POST["situationMat"]) || empty($_POST["nomC"]) || empty($_POST["prenomC"]) || empty($_POST["adresseC"]) || empty($_POST["telephonePC"]) || empty($_POST["telephoneFC"]) || empty($_POST["emailPC"]) || empty($_POST["respE"]) || empty($_POST["contact"])) {
    header("Location:form.php?error=" . $error);
} else {
    $identifiant = new Identification($_POST['nom'], $_POST['prenom'], $_POST['civilite'], $_POST["datenaissance"], $_POST["lieunaissance"], $_POST['CNI'], $_POST['INE'], $_POST['numerocarteetdiant'], $_POST['PaysNaissance'], $_POST['nationalite']);
    $adresse = new Adresse($_POST['adresseprincipale'], $_POST['adressesecondaire'], $_POST['mailP'], $_POST['mailI'], $_POST['telephoneP'], $_POST['telephoneF'], $_POST['boitepostal']);
    $emploi = new Emploi($_POST['Salarie'], $_POST['statutE'], $_POST['socioprfessionelle']);
    $situationFamiliale = new SituationFamiliale($_POST['situationMat'], $_POST['nbenfant']);
    $bourse = new Bourse($_POST['bourse'], $_POST['natureB'], $_POST['mntBourse']);
    $contact = new Contact($_POST['nomC'], $_POST['prenomC'], $_POST['adresseC'], $_POST['villeC'], $_POST['telephonePC'], $_POST['telephoneFC'], $_POST['emailPC'], $_POST['boitepostalC'], $_POST['faxC'], $_POST['respE'], $_POST['contact']);

    try {
        $dbc = new PDO($host, $user, $pass);

        $dbc->exec("INSERT INTO adresseActuelle Values('$adresse->adressePrincipale','$adresse->adresseSecondaire','$adresse->emailPersonnel','$adresse->emailInstitutionnel','$adresse->telephonePortable','$adresse->telephoneFixe','$adresse->boitePostale')");
        $dbc->exec("INSERT INTO emploi(activiteSalarier, StatutEtudiant, CategorieSocioPro) VALUES('$emploi->activiteSalarie', '$emploi->statutEtudiant', '$emploi->categorieSocioPro')");
        $dbc->exec("INSERT INTO situationFamiliale(situationMatrimoniale, nombreEnfant) VALUES('$situationFamiliale->situationMatrimoniale',$situationFamiliale->nombreEnfant)");
        $dbc->exec("INSERT INTO bourse(bourse, natureBourse, montantBourse) VALUES(100,'$bourse->bourse','$bourse->natureBourse','$bourse->montantBourse')");
        $dbc->exec("INSERT INTO contact VALUES('$contact->nom','$contact->prenom','$contact->adresse','$contact->ville','$contact->telephonePortable','$contact->telephoneFixe','$contact->emailPersonnel','$contact->boitePostale','$contact->fax','$contact->responsableEtudiant','$contact->contact')");
        foreach ($dbc->query('SELECT * FROM emploi ORDER BY matricule DESC LIMIT 1') as $row) {
            $fk_emploi = $row;
        }
        foreach ($dbc->query('SELECT * FROM situationFamiliale ORDER BY matricule DESC LIMIT 1') as $row) {
            $fk_SF = $row;
        }
        foreach ($dbc->query('SELECT * FROM emploi ORDER BY matricule DESC LIMIT 1') as $row) {
            $fk_bourse = $row;
        }
        $dbc->exec("INSERT INTO identification VALUES('$identifiant->nom','$identifiant->prenom','$identifiant->civilite','$identifiant->dateNaissance','$identifiant->lieuNaissance','$identifiant->CNI','$identifiant->INE','$identifiant->carteEtudiant','$identifiant->paysNaissance','$identifiant->nationalite','$adresse->emailInstitutionnel','$fk_emploi','$fk_SF','$fk_bourse','$contact->emailPersonnel')");
        header("Location:index.php");
    } catch (PDOException $pdoE) {
        $error = $pdoE->getMessage();
        header("Location:form.php?error=" . $error);
    }
}
?>