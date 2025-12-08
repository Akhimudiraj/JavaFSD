class demo3{
    constructor(){
        console.log("hi constructor");
        
    }

    display(id:number, name:String, age:number, designation:String){
        console.log("Id "+id );
        console.log("name "+name);
        console.log("age "+age);
        console.log("designation "+designation);

    }

}

var d3=new demo3();
d3.display(1,"robeert",22,"dev");

