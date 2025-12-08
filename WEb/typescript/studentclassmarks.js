"use strict";
// class student{
//     name:string;
//     marks:number;
//     constructor(name:string,marks:number){
//         this.name=name;
//         this.marks=marks;
//     }
Object.defineProperty(exports, "__esModule", { value: true });
//     display(s:student):void{
//         console.log("name "+s.name);
//         console.log("marks "+s.marks);        
//     }
// }
// let s1= new student("micky",100);
// s1.display();
class student {
    constructor(name, marks) {
        this.name = name;
        this.marks = marks;
    }
    display() {
        console.log("name " + this.name);
        console.log("marks " + this.marks);
    }
}
let s1 = new student("micky", 100);
s1.display();
//# sourceMappingURL=studentclassmarks.js.map