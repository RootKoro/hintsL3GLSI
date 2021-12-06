<?php
	$prenom=$_REQUEST['prenom'];
	$nom=$_REQUEST['nom'];
	$code=$_REQUEST['code'];
	$numcompte=$_REQUEST['numcompte'];
	$email=$_REQUEST['email'];
	$solde=$_REQUEST['solde'];
$con=mysqli_connect("localhost","root","momo","banque");
$req="insert into clients(prenom,nom,code,numcompte,email,solde) values('".$prenom."','".$nom."','".$code."','".$numcompte."','".$email."','".$solde."')";
if(mysqli_query($con,$req))
echo "insertion réussie";
else
echo "problème de connection";
?>
