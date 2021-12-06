<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" type="text/css" href="../bootstrap/dist/css/bootstrap.css">
    <link rel="stylesheet" href="../css/form.css">
    <title>Formulaire inscription</title>
</head>

<body>
    <div class="row">

        <div class="col-md-12 offset-md-10">
            <h1>Formulaire d'inscription</h1>
            <h3>Les champs avec <span>*</span> sont obligatoires</h3>
            <?php 
                if(isset($_GET['error'])) echo '<h3 name="error" style="color:red; background-color: rgba(160, 245, 217, 0.938); padding:5px">'.$_GET['error'].'</h3>'; 
            ?>
            <form action="treater.php" method="POST">
                <div class="bordering">
                    <fieldset>
                        <legend>Identification</legend>
                        <table>
                            <tr>
                                <td><label for="nom"><span>*</span>Nom: </label></td>
                                <td><input type="text" id="nom" name="nom" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="prenom"><span>*</span>Prenom:</label></td>
                                <td><input type="text" id="prenom" name="prenom" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label><span>*</span>Civilite:</label></td>
                                <td><select name="civilite">
                                        <option >M</option>
                                        <option >Mme</option>
                                        <option >Mlle</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label for="datenaissance"><span>*</span>Date de naissance:</label></td>
                                <td><input type="date" id="datenaissance" name="datenaissance" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="lieunaissance"><span>*</span>Lieu de Naissance:</label></td>
                                <td><input type="text" id="lieunaissance" name="lieunaissance" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="CNI"><span>*</span>CNI:</label></td>
                                <td><input type="number" id="CNI" name="CNI" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="INE"><b>*</b>INE:</label></td>
                                <td><input type="text" id="INE" name="INE"></td>
                            </tr>
                            <tr>
                                <td><label for="numerocarteetdiant"><span>*</span>Numero carte d'etudiant:</label></td>
                                <td><input type="number" id="numerocarteetdiant" name="numerocarteetdiant" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="PaysNaissance"><b>*</b>Pays de naissance:</label></td>
                                <td><input type="text" id="PaysNaissance" name="PaysNaissance"></td>
                            </tr>
                            <tr>
                                <td><label for="nationalite"><b>*</b>Nationalité:</label></td>
                                <td><input type="text" id="nationalite" name="nationalite"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="bordering">
                    <fieldset>
                        <legend>Adresse Actuelle</legend>
                        <table>
                            <tr>
                                <td><label for="adresseprincipale"><span>*</span>Adresse principale :</label></td>
                                <td><input type="text" id="adresseprincipale" name="adresseprincipale" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="adressesecondaire"><b>*</b>Adresse Secondaire :</label></td>
                                <td><input type="text" id="adressesecondaire" name="adressesecondaire"></td>
                            </tr>
                            <tr>
                                <td><label for="mailP"><span>*</span>Email personnel :</label></td>
                                <td><input type="email" id="mailP" name="mailP" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="mailI"><span>*</span>Email institutionnel :</label></td>
                                <td><input type="email" id="mailI" name="mailI" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="telephoneP"><span>*</span>téléphone Portable:</label></td>
                                <td><input type="tel" id="telephoneP" name="telephoneP" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="telephoneF"><span>*</span>téléphone Fixe:</label></td>
                                <td><input type="tel" id="telephoneF" name="telephoneF" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="boitepostal"><b>*</b>Boite postal :</label></td>
                                <td><input type="text" id="boitepostal" name="boitepostal"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="bordering">
                    <fieldset>
                        <legend>Emploi</legend>
                        <table>
                            <tr>
                                <td><label><b>*</b>Activité Salarié:</label></td>
                                <td>
                                    <input type="radio" name="Salarie" value="oui">OUI
                                    <input type="radio" name="Salarie" value="non">NON
                                </td>
                            </tr>
                            <tr>
                                <td><label><b>*</b>Statut etudiant:</label></td>
                                <td><select name="statutE">
                                        <option >Regime Normal</option>
                                        <option >Regime Salarié</option>
                                        <option >Regime Particulier</option>
                                        <option>Mise en position de stage</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label for="socioprfessionelle"><b>*</b>Categorie Socioprofessionelle:</label></td>
                                <td><input type="text" id="socioprfessionelle" name="socioprfessionelle"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="bordering">
                    <fieldset>
                        <legend>Situation familiale</legend>
                        <table>
                            <tr>
                                <td><label for="situationMat"><span>*</span>Situation matrimonial</label></td>
                                <td><input type="text" id="situationMat" name="situationMat" placeholder="Marié,Célibataire,Veuf" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="nbenfant"><span>*</span>nombre d'enfant</label></td>
                                <td><input type="number" id="nbenfant" name="nbenfant" #REQUIRED></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="bordering">
                    <fieldset>
                        <legend>Bourse</legend>
                        <table>
                            <tr>
                                <td><label><span>*</span>Bourse</label></td>
                                <td><input type="radio" name="bourse" value="Non_boursier">Non Boursier
                                    <input type="radio" name="bourse" value="Boursier">Boursier
                                    <input type="radio" name="bourse" value="Etranger">Etranger<br>
                                    <input type="radio" name="bourse" value="Etranger_exonore">Etranger exonéré
                                    <input type="radio" name="bourse" value="Etranger_tarif_normal">Etranger tarif normal
                                </td>
                            </tr>
                            <tr>
                                <td><label><b>*</b>Nature de la bourse</label></td>
                                <td><input type="radio" name="natureB" value="National">National
                                    <input type="radio" name="natureB" value="Etrangere">Etrangère
                                    <input type="radio" name="natureB" value="Etablissement">De l'etablissement
                                </td>
                            </tr>
                            <tr>
                                <td><label for="mntBourse"><b>*</b>Montant de la boure</label></td>
                                <td><input type="number" id="mntBourse" name="mntBourse"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="bordering">
                    <fieldset>
                        <legend>Contact (Personne à contacter/Responsable)</legend>
                        <table>
                            <tr>
                                <td><label for="nomC"><span>*</span>Nom</label></td>
                                <td><input type="text" id="nomC" name="nomC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="prenomC"><span>*</span>Prénom</label></td>
                                <td><input type="text" id="prenomC" name="prenomC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="adresseC"><span>*</span>Adresse</label></td>
                                <td><input type="text" id="adresseC" name="adresseC"></td>
                            </tr>
                            <tr>
                                <td><label for="villeC"><b>*</b>Ville</label></td>
                                <td><input type="text" id="villeC" name="villeC"></td>
                            </tr>
                            <tr>
                                <td><label for="telephonePC"><span>*</span>Telephone portable</label></td>
                                <td><input type="tel" id="telephonePC" name="telephonePC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="telephoneFC"><span>*</span>Telephone Fixe</label></td>
                                <td><input type="tel" id="telephoneFC" name="telephoneFC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="emailPC"><span>*</span>Email personnel</label></td>
                                <td><input type="text" id="emailPC" name="emailPC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="boitepostalC"><b>*</b>Boite postal</label></td>
                                <td><input type="text" id="boitepostalC" name="boitepostalC" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="faxC"><b>*</b>Fax</label></td>
                                <td><input type="text" id="faxC" name="faxC"></td>
                            </tr>
                            <tr>
                                <td><label for="respE"><span>*</span>responsable etudiant</label></td>
                                <td><input type="text" id="respE" name="respE" #REQUIRED></td>
                            </tr>
                            <tr>
                                <td><label for="contact"><span>*</span>Personne à contacter</label></td>
                                <td><input type="text" id="contact" name="contact" #REQUIRED></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div class="centering">
                    <input type="submit" name="submit" value="soumettre">
                    <input type="reset" name="reset" value="reinitialiser">
                </div>
            </form>
        </div>
    </div>
</body>

</html>