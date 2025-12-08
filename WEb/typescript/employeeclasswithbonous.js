"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Employee {
    constructor(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    getAnnualsalary() {
        return this.salary * 12;
    }
    givebonous(percent) {
        return this.salary + (this.salary * percent / 100);
    }
}
let e = new Employee(1, "micky", 50000);
console.log("annual " + e.getAnnualsalary());
console.log("bonous " + e.givebonous(20));
//# sourceMappingURL=employeeclasswithbonous.js.map