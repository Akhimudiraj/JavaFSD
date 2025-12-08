//What are Intersection Types?
//EmployeePerson must have all properties from Person AND Employee.
//If you miss one property, TypeScript will throw an error.
var emp = {
    name: "micky",
    age: 22,
    employeeid: 101,
    // role:"dev"
};
console.log(emp);
