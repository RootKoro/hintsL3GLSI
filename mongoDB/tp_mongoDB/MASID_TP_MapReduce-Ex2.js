//question 1
let exo2q1map = function(){
    if(this.pop>100000)
        emit(this._id,this.pop);
}

let exo2q1red = function(key, values){
    return values;
}

db.zips.mapReduce(exo2q1map,exo2q1red,{out:'ex2q1'})

let exo2q1=db.ex2q1;

//question 2
let exo2q2map = function(){
    emit(this._id,this.pop);
}

let exo2q2quer= {query :{pop:{$gt:100000}},out:'ex2q2'};

db.zips.mapReduce(exo2q2map,exo2q1red,exo2q2quer)

let exo2q2=db.ex2q2;

/* la solution a privilegier serait la seconde,
qui au lieu d'utiliser une structure conditionnelle comme filtre,
utilise plutôt le filtre query de mapReduce() et allège le code. */

//question3
//pop totale
let exo2q3map = function(){
    emit(this.state,this.pop);
}

let exo2q3red= function(key, values){
    return Array.sum(values);
}

db.zips.mapReduce(exo2q3map,exo2q3red,{out:'ex2q3'})

let exo2q3=db.ex2q3;

//sort slice
exo2q3.find({},{values:{$slice:3}}).sort({'values':1});

//question 4
let exo2q4map = function(){
    emit(this._id,this.city);
}

let exo2q4red= function(key, values){
    return values;
}

let exo2q4quer={query:{},out:'ex2q4',limit:10}

db.zips.mapReduce(exo2q4map,exo2q4red,exo2q4quer)

let exo2q4=db.ex2q4;