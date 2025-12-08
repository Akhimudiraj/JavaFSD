interface product{
    id:number;
    name:string;
    price:number;
}

let products: product[]=[
    {id:1,name:"samsung",price:50000},
    {id:1,name:"samsung",price:70000},
    {id:1,name:"samsung",price:60000},

]

let condition=products.filter(n=>n.price>60000);
console.log(condition);
