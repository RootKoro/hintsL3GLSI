<?php
$to=$_REQUEST['to'];
$sujet=$_REQUEST['sujet'];
$message=$_REQUEST['message'];
mail($to,$sujet,$message);
?>
