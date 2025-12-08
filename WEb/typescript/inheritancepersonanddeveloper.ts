class person{
    constructor(public name:String){

    }

    
}

class developer extends person{
    language:string;
    constructor(name:string,language:string){
        super(name);
        this.language=language;

    }

    display(){
        console.log("name "+this.name);
        console.log("language "+this.language);
        
        
    }

        
}

let dev= new developer("micky","java");
dev.display();