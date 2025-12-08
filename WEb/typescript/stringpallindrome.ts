function palli(name:string):boolean{
    return name==name.split("").reverse().join("");
}//split -> into characters [a k h i]
//reverse makes reverse i h k a
//join -> ihka
console.log(palli("akhi"));
