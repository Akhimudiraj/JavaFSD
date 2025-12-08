"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class person {
    constructor(name) {
        this.name = name;
    }
}
class developer extends person {
    constructor(name, language) {
        super(name);
        this.language = language;
    }
    display() {
        console.log("name " + this.name);
        console.log("language " + this.language);
    }
}
let dev = new developer("micky", "java");
dev.display();
//# sourceMappingURL=inheritancepersonanddeveloper.js.map