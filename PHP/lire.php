<?php
header("Content-Type:application/msword");
$fichier="note.odt";
$chaine=file_get_contents($fichier);
echo $chaine;
?>
