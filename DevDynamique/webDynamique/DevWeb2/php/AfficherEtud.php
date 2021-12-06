<?php
require('.conf.php');
require('Identification.php');
require('Adresse.php');
require('Emploi.php');
require('SituationFamiliale.php');
require('Bourse.php');
require('Contact.php');

//Connexion avec la BD

	$connexPdo = new PDO($host,$user,$pass);

	$error = "Informations saisies invalides !";

	if (empty($_POST["numet"]) || empty($_POST["CNI"]) || empty($_POST["INE"]) ){
	    header("Location:index.php?error=" . $error);
	} else {

		//Variables
			$matricule=$_POST['CNI'];
			$carteEt = $_POST["numet"];
			$ine = $_POST['INE'];

		//Récupération des informations dans la BD
		//preparation de recuperation
			$pdoPrep = $connexPdo->prepare('SELECT * FROM identification WHERE numeroCarteEtudiant = ? OR CNI = ? OR INE = ?');
			// $pdoPrep = $connexPdo->prepare('SELECT * FROM identification where CNI='. $matricule);

		//Execution
			$execPdo = $pdoPrep->execute([$carteEt,$matricule,$ine]);
		
		//fetching
			$etudiants = $pdoPrep->fetchAll();
			?>
				<!DOCTYPE html>
				<html lang="en">
				<head>
					<meta charset="UTF-8">
					<meta http-equiv="X-UA-Compatible" content="IE=edge">
					<meta name="viewport" content="width=device-width, initial-scale=1.0">
					<link rel="stylesheet" href="../css/form.css">
					<link rel="stylesheet" href="../bootstrap/dist/css/bootstrap.css">
					<title>Liste des Etudiants</title>
				</head>
				<body>
					<h1>Liste des etudiants</h1>
					<ul>
						<?php foreach ($etudiants as $etudiant) { ?>
						<li>
							<div class="row lister">
								<div class="col-md-2"><div class="cadre">etudiant</div></div>
								<div class="col-md-8">
									<?php echo $etudiant['civilite']." ".$etudiant['nom']." ".$etudiant['prenom']." ( né(e) le ".$etudiant['dateDeNaissance']." à ".$etudiant['lieuDeNaissance'].' )';?>
								</div>
							</div>
						</li>
						<?php } ?>
					</ul>
				</body>
				</html>
			<?php
			
	}

?>