"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class animal {
}
class dog extends animal {
    sound() {
        console.log("dog barks");
    }
}
class cat extends animal {
    sound() {
        console.log("cat meow meow");
    }
}
let animals = [
    new dog(), new cat()
];
for (let a of animals) {
    a.sound();
}
//# sourceMappingURL=abstractclasspolymorphism.js.map