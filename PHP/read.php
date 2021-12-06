<?php
$con=mysqli_connect("localhost","koro","P@sser123/","banque");
$req="select * from client";
$result=mysqli_query($con,$req);
$chaine = "<table border='1px'>
    <tr>
        <td>ID</td>
        <td>Prenom</td>
        <td>Nom</td>
        <td>Numéro de compte</td>
        <td>solde</td>
        <td>code</td>
    </tr>";
while($ligne=mysqli_fetch_assoc($result))
{$chaine  =$chaine."<tr><td>" .$ligne['user'] . "</td><td>" .$ligne['host'] . "</td></tr>";}
$chaine =$chaine."</table>";
echo $chaine;
?>