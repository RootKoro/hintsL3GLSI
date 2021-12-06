<?php
$con=mysqli_connect("localhost","root","momo","banque");
$req="select * from clients";
$result=mysqli_query($con,$req);
$chaine =
 "<table border='1px'><tr><td>PRENOM</td><td>NOM</td><td>CODE</td><td>SOLDE</td><td>NOM</td><td>NOM</td><td>NOM</td><td>NOM</td>
</tr>";
while($ligne=mysqli_fetch_assoc($result))
{$chaine  =$chaine."<tr><td>" .$ligne['prenom'] . "</td><td>" .$ligne['nom'] . "</td><td>" .$ligne['code'] . "</td><td>" .$ligne['solde'] . "</td><td>" .$ligne['prenom'] . "</td><td>" .$ligne['prenom'] . "</td><td>" .$ligne['prenom'] . "</td><td>" .$ligne['prenom'] . "</td></tr>";}
$chaine =$chaine."</table>";
echo $chaine;
?>

