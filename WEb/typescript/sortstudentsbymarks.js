"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//The sort() method sorts arrays in JavaScript/TypeScript.
//By default, it converts elements to strings and sorts lexicographically (alphabetically).
let list = [
    { name: "A", marks: 100 },
    { name: "B", marks: 10 },
    { name: "c", marks: 25 },
    { name: "d", marks: 200 },
];
//<0 a comes 
//>0 b comes
//let sorted = list.sort((a,b)=>b.marks-a.marks); //descending
let sorted = list.sort((a, b) => a.marks - b.marks); //ascending
console.log(sorted);
//# sourceMappingURL=sortstudentsbymarks.js.map