abstract class animal{

    abstract sound():void
}

class dog extends animal{
    sound():void{
        console.log("dog barks");
        
    }
}

class cat extends animal{
    sound():void{
        console.log("cat meow meow");
        
    }
}

let animals:animal[]=[
    new dog(),new cat()
];

for(let a of animals){
    a.sound();
}