interface Employee{
    id:number;
    name:string;
    salary:number;
}



function display(e :Employee):void
{
    console.log("id "+e.id);
    console.log("name "+e.name);
    console.log("salary "+e.salary);
   console.log("=====================");
    
    
    
}

let emp:Employee={id:1,name:"micky",salary:50000};
display(emp);
console.log(emp);
