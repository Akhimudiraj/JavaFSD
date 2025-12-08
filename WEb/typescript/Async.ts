async function getUser() {
 return "User Loaded";
 }
 async function start() {
 let result = await getUser();
 console.log(result);
 }
 start();

 //An async function is a special kind of function in JavaScript/TypeScript that always returns a Promise, even if you return a plain value.

//It allows you to write asynchronous code in a way that looks synchronous using the await keyword.