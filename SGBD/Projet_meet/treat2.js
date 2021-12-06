var theme = document.getElementById('themeChanger');
/* var nextButton = document.getElementById('nb');
var page = 0;

var prevButton = document.createElement('input');
prevButton.type = 'button';
prevButton.value = 'précédent';
prevButton.id = 'pb';

var finishButton = document.createElement('input');
finishButton.type = 'submit';
finishButton.value = 'terminer';
finishButton.id = 'fb';

document.querySelector('form').method = "post";
document.querySelector('form').action = "insert.php";

zerop(); */
theme.onclick = changing;
//nextButton.onclick = next;

function changing(){
    if(document.body.style.backgroundImage == 'url("bg6.jpg")')
    document.body.style.backgroundImage = 'url("c_bg1.png")';
    else
    document.body.style.backgroundImage = 'url("bg6.jpg")';
}

/* function next(){
    switch(page){
        case 0:
            document.body.childNodes[5].childNodes[3].removeChild(nextButton);
            document.body.childNodes[5].childNodes[3].appendChild(prevButton);
            document.body.childNodes[5].childNodes[3].appendChild(nextButton);
            firstp();
            break;

        case 1:
            secondp();
            break;

        case 2:
            thirdp();
            break;

        case 3:
            lastp();
            document.body.childNodes[5].childNodes[3].appendChild(finishButton);
            document.body.childNodes[5].childNodes[3].removeChild(nextButton);
            break;
    }
    
    page++;
}

prevButton.onclick = preview;

function preview(){
    switch(page){
        case 1:
            zerop();
            document.body.childNodes[5].childNodes[3].removeChild(prevButton);
            break;

        case 2:
            firstp();
            break;

        case 3:
            secondp();
            break;

        case 4:
            thirdp();
            document.body.childNodes[5].childNodes[3].removeChild(finishButton);
            document.body.childNodes[5].childNodes[3].appendChild(nextButton);
            break;
    }
    page--;
} */