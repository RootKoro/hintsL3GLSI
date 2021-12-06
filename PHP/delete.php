<?php
        $code1=$_REQUEST['code'];
        $email1=$_REQUEST['email'];
$con=mysqli_connect("localhost","root","momo","banque");
$req="select * from clients where code='$code' and email='$email'";
$result=mysqli_query($con,$req);
if(mysqli_num_rows($result)>0){
$req1="delete from clients where code='$code'";
mysqli_query($con,$req1);
$reponse="supprimée";}
else $reponse="problème rencontré";
echo $reponse;
?>
 
