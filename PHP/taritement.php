<?php
	$fichier=file_get_contents("php://input");
	//echo $fichier;
	$tab=explode("&",$fichier);
	$prenom=explode("=",$tab[0]);
	$nom=explode("=",$tab[1]);
	$age=explode("=",$tab[2]);
	//echo $prenom[1]."  ".$nom[1]."  ".$age[1];
	$chaine="<table border='1px'><tr><td>Prenom</td><td>Nom</td><td>Age</td></tr>";
	$chaine=$chaine."<tr><td>".$prenom[1]. "</td><td>". $nom[1]."</td><td>".$age[1]."</td></tr>";
	echo $chaine;
?>
