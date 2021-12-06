// Declaration variables
const btnAffiche = document.querySelector("#afficher");
const btnInsert = document.querySelector("#Inserer");
const flt = document.querySelector(".filter");

// display survey part for filter

btnAffiche.addEventListener("click",function(){
	btnInsert.style.display="none";
	flt.style.display="block";
})