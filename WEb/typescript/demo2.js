"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class demo2 {
    constructor() {
        console.log("hi constructor");
        for (var i = 0; i <= 5; i++) {
            console.log("i " + i);
        }
    }
    display() {
        console.log("hi method");
        for (var j = 0; j <= 5; j++) {
            console.log("j " + j);
        }
    }
}
var d1 = new demo2;
d1.display();
//# sourceMappingURL=demo2.js.map