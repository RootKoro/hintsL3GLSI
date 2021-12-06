<?php

$code=$_REQUEST['code'];
$codenouv=$_REQUEST['codenouv'];
$email=$_REQUEST['email'];
$con=mysqli_connect("localhost","root","momo","banque");
$req="select * from clients where code='$code' and email='$email'";
$result=mysqli_query($con,$req);
if(mysqli_num_rows($result)>0){
$req1="update clients set code='$codenouv' where email='$email'";
mysqli_query($con,$req1);
$reponse="changement de code effectue";}
else $reponse="probleme identification" ;
echo $reponse ;
?>

