<?php
include("connection.php");
$req="select * from etudiant";
$result=mysqli_query($con,$req);
$tab=mysqli_fetch_all($result,MYSQLI_ASSOC);
//print_r($tab);
?>
