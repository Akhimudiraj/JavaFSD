//What are Intersection Types?

//Intersection types combine multiple types into one.
//A value of an intersection type must satisfy all //of the types it combines.

//Symbol: &

//Useful when you want an object to have properties of multiple types.


type person={
    name:string;
    age:number;
};

type Employee={
    employeeid:number;
    role:string;
};

type employeeperson = person & Employee;
//EmployeePerson must have all properties from Person AND Employee.

//If you miss one property, TypeScript will throw an error.

let emp:employeeperson={
    name:"micky",
    age:22,
    employeeid:101,
    role:"dev"
};
console.log(emp);
