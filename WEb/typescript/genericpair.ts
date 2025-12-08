class pair<T,U>{  //generics
    value1:T;
    value2:U;

    constructor(value1:T,value2:U){
        this.value1=value1;
        this.value2=value2
    }

    display():void{
        console.log("value 1 "+this.value1);
        console.log("value 2 "+this.value2);
        
        
    }
}

let p1= new pair<number,string>(1,"miky");
let p2=new pair<boolean,string>(true,"nice");
p1.display();
p2.display();