<?php
$host="mysql:host=localhost;dbname=etudiant";
$login="root";
$password="";
try{
$bdd= new PDO($host,$login,$password);
echo " Connexion bdd réussie ";
} catch(Exception $e) {
	die("Erreur :".$e->getMessage());
}
if(isset($_POST['submit'])){
$nom=$_POST['nom'],
$prenoms=$_POST['prenoms'],
$civilite=$_POST['civilite'],
$date_naissance=$_POST['date_naissance'],
$lieu_naissance=$_POST['lieu_naissance'],
$CNI=$_POST['cni'],
$INE=$_POST['ine'],
$Num_carte=$_POST['num_carte'],
$pays_naissance=$_POST['pays_naissance'],
$nationalite=$_POST['nationalite']

$adresse_principale=$_POST['adresse_principale'],
$adresse_secondaire=$_POST['adresse_secondaire'],
$email=$_POST['email'],
$Tel_portable=$_POST['tel_portable'],
$tel_fixe=$_POST['tel_fixe'],
$email_personnel=$_POST['email_personnel'],
$email_institutionnel=$_POST['email_institutionnel'],
$Boite_postale=$_POST['boite_postale']

$Activite_salarie=$_POST['activite_salarie'], 
$Statut_etudiant=$_POST['statut_etudiant'], 
$Categorie_socio=$_POST['categorie_socio']

$Situation_matrimoniale=$_POST['situation_matrimoniale'], 
$nb_enfants=$_POST['nb_enfants']

$Bourse=$_POST['bourse'],
$Nature_bourse=$_POST['nature_bourse'],
$Montant_bourse=$_POST['montant_bourse']


$Nom=$_POST['nom'],
$Prénoms=$_POST['prenoms'],
$Adresse=$_POST['adresse'],
$Ville=$_POST['ville'],
$tel_portable=$_POST['tel_portable'],
$tel_fixe=$_POST['tel_fixe'],
$Email_personnel=$_POST['email_personnel'],
$Boite_postale=$_POST['boite_postale'],
$Fax=$_POST['fax'],
$Responsable_étudiant=$_POST['responsable_etudiant'],
$Personne_contacter=$_POST['personne_contacter']
echo "insertion reusii";
} else {
echo "diagal ngau bagn??????";
}