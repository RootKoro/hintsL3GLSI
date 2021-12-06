<?php
$chaine="<table border='1px'><tr><td>prenom</td><td>nom</td><td>code</td><td>note</td><td>email</td></tr>";
foreach ($tab as $ligne) {$prenom=$ligne['prenom'];$nom=$ligne['nom'];$code=$ligne['code'];$note=$ligne['note'];$email=$ligne['email'];$chaine=$chaine"<tr><td>$prenom</td><td>$nom</td><td>$code</td><td>$note</td><td>$email</td></tr>";}
$chaine=$chaine."</table>";
echo $chaine;
?>
