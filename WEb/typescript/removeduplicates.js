"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let items = [1, 1, 2, 4, 5, 5, 5, 6, 4, 2, 8, 9,];
let uni = [...new Set(items)];
console.log(uni);
// function removeDuplicates(arr: number[]): number[] {
//     return [...new Set(arr)]; 
// }
// console.log(removeDuplicates([1, 2, 2, 3, 4, 4, 5]));
//# sourceMappingURL=removeduplicates.js.map