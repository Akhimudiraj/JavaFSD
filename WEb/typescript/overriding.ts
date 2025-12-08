class A{
    constructor(){
        console.log("A class");
        
    }
}

class B extends A{
    constructor(){
        super()
        console.log("B class");
        
    }

}

var b = new B();

class x{
    abc(){
        console.log(" x class abc method");
        
    }
}

class y extends x{
    
    abc(){
        super.abc();
        console.log("y class abc method");
        
    }
}

let y1= new y();
y1.abc();

