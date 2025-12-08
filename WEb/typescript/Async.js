"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
function getUser() {
    return __awaiter(this, void 0, void 0, function* () {
        return "User Loaded";
    });
}
function start() {
    return __awaiter(this, void 0, void 0, function* () {
        let result = yield getUser();
        console.log(result);
    });
}
start();
//An async function is a special kind of function in JavaScript/TypeScript that always returns a Promise, even if you return a plain value.
//It allows you to write asynchronous code in a way that looks synchronous using the await keyword.
//# sourceMappingURL=Async.js.map