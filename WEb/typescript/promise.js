"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function fetchData() {
    return new Promise((resolve) => {
        setTimeout(() => resolve("data received"), 1500);
    });
}
fetchData().then((data) => console.log(data));
//# sourceMappingURL=promise.js.map