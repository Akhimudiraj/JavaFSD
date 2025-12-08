"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class demo4 {
    display(id, name, age, designation = "GET", pan) {
        console.log("Id " + id);
        console.log("name " + name);
        console.log("age " + age);
        console.log("designation " + designation);
        console.log("=======================");
    }
    display1(id = 1, name, salary) {
        console.log("id " + id);
        console.log("name " + name);
        console.log("salary " + salary);
    }
}
var d4 = new demo4();
d4.display(1, "micky", 22, "dev", "micky123");
d4.display(2, "room", 23, "tester");
d4.display(3, "bhai", 33, "bhai123");
console.log("===========================================");
let d5 = new demo4();
d5.display1(1);
d5.display1();
//# sourceMappingURL=demo4.js.map