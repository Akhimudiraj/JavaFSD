"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Person1 {
    constructor(name, id) {
        this.name = name;
        this.id = id;
    }
    method() {
        console.log("Hello " + this.name);
        console.log("age " + this.id);
    }
}
let p = new Person1("akhi", 20);
p.method();
//# sourceMappingURL=Person1.js.map