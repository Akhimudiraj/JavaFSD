//items 
interface Item{
    name:string;
    price:number;
    quantity:number;
}

//orderservice

class service{
    private items:Item[]=[]; //initailizing an empty array

    //add items
    additem(item:Item):void{
        this.items.push(item);

    }
    

    totalamount():number{
        return this.items
                   .map(a=>a.quantity*a.price)
                   .reduce((a,b)=> a+b,0)
    }
}

let ss= new service();
ss.additem({name:"pizza",price:200,quantity:2});

console.log("total bill",ss.totalamount());


