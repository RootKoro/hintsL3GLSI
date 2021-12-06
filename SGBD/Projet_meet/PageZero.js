function zerop(){
    document.body.childNodes[5].childNodes[1].innerHTML =
    '<fieldset id="field1">'+
        '1. Comment qualifieriez-vous la charge de travail demandée par le cours ?<br><br>'+
        '<div class="left">'+
            '<input type="radio" name = "Q1" value="r1">Beaucoup trop importante<br>'+
            '<input type="radio" name = "Q1" value="r2">Trop importante<br>'+
        '</div>'+
        '<div class="mid">'+
            '<input type="radio" name = "Q1" value="r3">Un peu trop importante<br>'+
            '<input type="radio" name = "Q1" value="r4">Ni trop importante ni trop insuffisante<br>'+
            '<input type="radio" name = "Q1" value="r5">Un peu trop insuffisante<br>'+
        '</div>'+
        '<div class="right">'+
            '<input type="radio" name = "Q1" value="r6">Trop importante<br>'+
            '<input type="radio" name = "Q1" value="r7">Beaucoup trop insuffisante<br>'+
        '</div>'+
    '</fieldset><br>'+

    '<fieldset id = "field2">'+
        '2. Le cours a t-il répondu à vos attentes ?<br><br>'+
        '<div class="left">'+
            '<input type="radio" name = "Q2" value="r1">Extrêmement bien répondu<br>'+
            '<input type="radio" name = "Q2" value="r2">Très bien répondu<br>'+
        '</div>'+
        '<div class="mid">'+
            '<input type="radio" name = "Q2" value="r3">Assez bien répondu<br>'+
        '</div>'+
        '<div class="right">'+
            '<input type="radio" name = "Q2" value="r4">Peu répondu<br>'+
            '<input type="radio" name = "Q2" value="r5">Pas du tout répondu<br>'+
        '</div>'+
    '</fieldset><br>'+

    '<fieldset id="field4">'+
        '3. Le cours a t-il contribué à votre connaissance en la matière ?<br><br>'+
        '<div class="left">'+
            '<input type="radio" name = "Q3" value="r1">Énormément contribué<br>'+
            '<input type="radio" name = "Q3" value="r2">Beaucoup contribué<br>'+
        '</div>'+
        '<div class="mid">'+
            '<input type="radio" name = "Q3" value="r3">Plutôt contribué<br>'+
        '</div>'+
        '<div class="right">'+
            '<input type="radio" name = "Q3" value="r4">Peu contribué<br>'+
            '<input type="radio" name = "Q3" value="r5">Pas du tout contribué<br>'+
        '</div>'+
    '</fieldset><br>'+

    '<fieldset id="field4">'+
        '4. Comment qualifieriez-vous le cours ?<br><br>'+
        '<div class="left">'+
            '<input type="radio" name = "Q4" value="r1">Extrêmement facile<br>'+
            '<input type="radio" name = "Q4" value="r2">Très facile<br>'+
        '</div>'+
        '<div class="mid">'+
            '<input type="radio" name = "Q4" value="r3">Assez facile<br>'+
            '<input type="radio" name = "Q4" value="r4">Ni trop facile ni trop difficile<br>'+
            '<input type="radio" name = "Q4" value="r5">Assez difficile<br>'+
        '</div>'+
        '<div class="right">'+
            '<input type="radio" name = "Q4" value="r6">Très difficile<br>'+
            '<input type="radio" name = "Q4" value="r7">Extrêmement difficile<br>'+
        '</div>'+
    '</fieldset><br>';
}