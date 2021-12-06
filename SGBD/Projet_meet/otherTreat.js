document.body.style.backgroundImage = 'url("bg6.jpg")';

var theme = document.getElementById('themeChanger');
//var questions = document.getElementsByTagName('fieldset');

var
/* hiddenPoints = 0,
   compteur = 0, */
    possiblitiesCount = 0;

var responses = new Array(17);
for (var i = 0; i < responses.length; i++)
    responses[i] = null;

var hidden = document.createElement('input');
hidden.type = 'hidden';
hidden.value = 'Some points';
hidden.name = 'hidden';

var finishButton = document.createElement('input');
finishButton.type = 'submit';
finishButton.value = 'terminer';
finishButton.id = 'fb';

var nextButton = document.createElement('input');
nextButton.type = 'button';
nextButton.value = 'suivant';
nextButton.id = 'nb';

var prevButton = document.createElement('input');
prevButton.type = 'button';
prevButton.value = 'précédent';
prevButton.id = 'pb';

document.body.childNodes[5].childNodes[3].appendChild(nextButton);

theme.onclick = changing;
nextButton.onclick = next;
prevButton.onclick = preview;

// var checked = new Array(questions.length);

var input = document.getElementsByTagName('input');

for (var j = 0; j < input.length; j++)
    if (input[j].value == 'r1' || input[j].value == 'r2' || input[j].value == 'r3' || input[j].value == 'r4' || input[j].value == 'r5' || input[j].value == 'r6' || input[j].value == 'r7')
        possiblitiesCount++;

var possiblities = new Array(possiblitiesCount),
    k = 0;

for (var j = 0; j < input.length; j++) {
    if (input[j].value == 'r1' || input[j].value == 'r2' || input[j].value == 'r3' || input[j].value == 'r4' || input[j].value == 'r5' || input[j].value == 'r6' || input[j].value == 'r7') {
        possiblities[k] = input[j];
        k++;
    }
}

/* for (var j = 0; j < possiblitiesCount; j++) {
    for (var l = 0; l < responses.length; l++) {
        if (responses[l] != null && possiblities[j].checked == true) {
            responses[l] = possiblities[j];
            break;
        }
    }
} */

for (var i = 0; i < questions.length; i++)
    if (questions[i].checked)
        alert(questions[i].value);

function changing() {
    if (document.body.style.backgroundImage == 'url("bg6.jpg")')
        document.body.style.backgroundImage = 'url("c_bg1.png")';
    else
        document.body.style.backgroundImage = 'url("bg6.jpg")';
}

function next() {
    document.body.childNodes[5].childNodes[1].innerHTML =
        '<fieldset>' +
        '18. Si vous avez d\'autres suggestions ou commentaires concernant le cours, merci de nous en faire part.<br>' +
        '<textarea name="Q18">...</textarea>' +
        '</fieldset>' +
        '<br>';
    document.body.childNodes[5].childNodes[1].appendChild(hidden);
    document.body.childNodes[5].childNodes[3].replaceChild(prevButton, nextButton);
    document.body.childNodes[5].childNodes[1].appendChild(finishButton);

    for (var i = 0; i < possiblities.length; i++) {
        for (var j = 0; j < responses.length; j++) {
            if (responses[j] != null && possiblities[i].checked) {
                responses[j] = possiblities[i];
                break;
            }
        }
    }

    /* for (var i = 0; i < responses.length; i++)
        if (responses[i] != null)
            alert(responses[i]); */
}

function preview() {
    window.location.reload();
}