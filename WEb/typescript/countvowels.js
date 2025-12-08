"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class vowels {
    display(name) {
        let count = 0;
        let vowels = "aeiouAEIOU";
        for (let char of name) {
            if (vowels.includes(char)) {
                count++;
            }
        }
        return count;
    }
}
let ans = new vowels();
console.log(ans.display("appleelephant"));
//# sourceMappingURL=countvowels.js.map