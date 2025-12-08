class Person1{
    constructor(public name:string, private id:number){

    }

    method(){
        console.log("Hello "+this.name);
        console.log("age "+this.id);
        
        
    }

}

let p=new Person1("akhi",20);
p.method();