function lastp() {
    document.body.childNodes[5].childNodes[1].innerHTML =
        '<fieldset>' +
        '17. Dans quelle mesure les critères d’évaluation du cours étaient-ils clairs ?<br><br>' +
        '<div class="left">' +
        '<input type="radio" name = "Q17" value="r1">Extrêmement clairs<br>' +
        '<input type="radio" name = "Q17" value="r2">Très clairs<br>' +
        '</div>' +
        '<div class="mid">' +
        '<input type="radio" name = "Q17" value="r3">Assez clairs<br>' +
        '</div>' +
        '<div class="right">' +
        '<input type="radio" name = "Q17" value="r4">Peu clairs<br>' +
        '<input type="radio" name = "Q17" value="r5">Pas clairs du tout<br>' +
        '</div>' +
        '</fieldset>' +
        '<br>' +
        '<fieldset>' +
        '18. Si vous avez d\'autres suggestions ou commentaires concernant le cours, merci de nous en faire part.' +
        '<textarea name="Q18">...</textarea>' +
        '</fieldset>' +
        '<br>';
}