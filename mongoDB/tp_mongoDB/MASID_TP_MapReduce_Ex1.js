//1)
let exo1q1map = function(){ emit(this.id , 1); }

let exo1q1red = function(result , count){
    val= 0;
    for(i = 0; i<count.length; i++) val+=count[i];
    return val;
}

db.zips.mapReduce(exo1q1map, exo1q1red, {out: "exo1q1"})

let ex1q1 = db.exo1q1

//2)
let exo1q2red = function(result, values){
    val=0;
    reducer =(accelerator, currentVal)=>(accelerator+=currentVal);
    return values.reduce(reducer, val);
}

//3)
let exo1q3red = (result, values) => {
    val=0;
    values.forEach(element => {
        val+=element
    });
    return val;
}