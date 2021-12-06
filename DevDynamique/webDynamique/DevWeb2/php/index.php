<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>page d'accueil</title>

    <link rel="stylesheet" type="text/css" href="../bootstrap/dist/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../css/index.css">
    
    <!-- External Links -->

    <!--Semantic-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.6/semantic.min.css"> 
    <script src="https://cdn.jsdelivr.net/semantic-ui/2.2.6/semantic.min.js"></script> 

</head>
<body>

	<div>
		<fieldset>
           <legend><b>INFORMATION</b></legend>
           <p>******</p><br>
           <p>Cette page sert à vous orienter entre l'insertion d'un nouvel élève (le bouton Inserer Etudiant) dans la base de données des étudiants et l'affichage de la fiche étudiant (bouton Affichage Etudiant)</p><br>
           <p>******</p>
        </fieldset>
	</div>
    
        <div class="divphp">
            <?php 
                if(isset($_GET['error'])) echo '<h3 name="error" style="color:red; padding:5px">'.$_GET['error'].'</h3>';
            ?>
        </div>

    <div class="cadreBouton">

        <a href="form.php"><button type="submit" class="btton" id="Inserer">Inscrire un Etudiant</button></a>
        <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
        <button type="button" class="btton" id="afficher">Afficher Affiche Etudiant</button>
    </div>

    <form class="filter" action="AfficherEtud.php" method="POST">
        <div id="miniform" class="row"><br>

            <table>

            <tr>
               <td><label for="numcarteetdiant"><span>*</span>Numero carte d'etudiant:</label></td>
               <td><input type="number" id="numerocarteetdiant" name="numet" #REQUIRED></td>
            </tr>

            <tr>
               <td><label for="CNI"><span>*</span>CNI:</label></td>
               <td><input type="number" id="CNI" name="CNI" #REQUIRED></td>
            </tr>

            <tr>
               <td><label for="INE"><span>*</span>INE:</label></td>
               <td><input type="text" id="INE" name="INE"></td>
            </tr>

            </table>

            <button type="submit" id="consult"> Consulter </button>

        </div>
    </form>

<!--  -->
    <script type="text/javascript" src="../js/scriptIndex.js"></script>

</body>

</html>