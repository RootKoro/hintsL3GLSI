function firstp(){
    document.body.childNodes[5].childNodes[1].innerHTML = 
        '<fieldset>'+
            '5. Que pensez-vous du rythme du cours ?<br><br>'+
            '<div class="left">'+
                '<input type="radio" name = "Q5" value="r1">Beaucoup trop rapide<br>'+
                '<input type="radio" name = "Q5" value="r2">Trop rapide<br>'+
            '</div>'+
            '<div class="mid">'+
                '<input type="radio" name = "Q5" value="r3">Un peu trop rapide<br>'+
                '<input type="radio" name = "Q5" value="r4">Ni trop rapide ni trop lent<br>'+
                '<input type="radio" name = "Q5" value="r5">Un peu trop lent<br>'+
            '</div>'+
            '<div class="right">'+
                '<input type="radio" name = "Q5" value="r6">Trop lent<br>'+
                '<input type="radio" name = "Q5" value="r7">Beaucoup trop lent<br>'+
            '</div>'+
        '</fieldset>'+
        '<br>'+
        '<fieldset>'+
            '6. Pensez-vous que les supports utilisés (support papier, présentation) durant le cours ont été utiles ?<br><br>'+
            '<div class="left">'+
                '<input type="radio" name = "Q6" value="r1">Extrêmement utiles<br>'+
                '<input type="radio" name = "Q6" value="r2">Très utiles<br>'+
            '</div>'+
            '<div class="mid">'+
                '<input type="radio" name = "Q6" value="r3">Assez utiles<br>'+
            '</div>'+
            '<div class="right">'+
                '<input type="radio" name = "Q6" value="r4">Peu utiles<br>'+
                '<input type="radio" name = "Q6" value="r5">Pas du tout utiles<br>'+
            '</div>'+
        '</fieldset>'+
        '<br>'+
        '<fieldset>'+
            '7. Quelle est la probabilité que vous recommandiez le cours à d\'autres étudiants ?<br><br>'+
            '<div class="left">'+
                '<input type="radio" name = "Q7" value="r1">Extrêmement probable<br>'+
                '<input type="radio" name = "Q7" value="r2">Fortement probable<br>'+
            '</div>'+
            '<div class="mid">'+
                '<input type="radio" name = "Q7" value="r3">Modérément probable<br>'+
            '</div>'+
            '<div class="right">'+
                '<input type="radio" name = "Q7" value="r4">Peu probable<br>'+
                '<input type="radio" name = "Q7" value="r5">Pas du tout probable<br>'+
            '</div>'+
        '</fieldset>'+
        '<br>'+
        '<fieldset>'+
            '8. Dans l\'ensemble, êtes-vous satisfait(e) du contenu du cours ?<br><br>'+
            '<div class="left">'+
                '<input type="radio" name = "Q8" value="r1">Extrêmement satisfait(e)<br>'+
                '<input type="radio" name = "Q8" value="r2">Très satisfait(e)<br>'+
            '</div>'+
            '<div class="mid">'+
                '<input type="radio" name = "Q8" value="r3">Assez satisfait(e)<br>'+
                '<input type="radio" name = "Q8" value="r4">Ni satisfait(e) ni insatisfait(e)<br>'+
                '<input type="radio" name = "Q8" value="r5">Assez insatisfait(e)<br>'+
            '</div>'+
            '<div class="right">'+
                '<input type="radio" name = "Q8" value="r6">Très insatisfait(e)<br>'+
                '<input type="radio" name = "Q8" value="r7">Extrêmement insatisfait(e)<br>'+
            '</div>'+
        '</fieldset>'+
        '<br>';
}