"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class pair {
    constructor(value1, value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    display() {
        console.log("value 1 " + this.value1);
        console.log("value 2 " + this.value2);
    }
}
let p1 = new pair(1, "miky");
let p2 = new pair(true, "nice");
p1.display();
p2.display();
//# sourceMappingURL=genericpair.js.map