function identity(value: T): T {
 return value;
 }
 console.log(identity(100));
 console.log(identity("TS"));


 function identity2<T>(value: T): T {
    return value;
}

console.log(identity2<number>(100));  // 100
console.log(identity2<string>("TS")); // TS
