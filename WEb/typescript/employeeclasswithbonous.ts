class Employee{

    constructor(
        public id:number,
        public name:string,
        public salary:number

    ){}

    getAnnualsalary():number{
        return this.salary*12;
    }

    givebonous(percent:number):number{
        return this.salary+(this.salary*percent/100)
    }
}

let e= new Employee(1,"micky",50000);
console.log("annual "+e.getAnnualsalary());
console.log("bonous "+e.givebonous(20));

