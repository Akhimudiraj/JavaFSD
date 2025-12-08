function apple(target: Function) {
    console.log("this is logger function");
}
//decorator is a just a function  //this function runs when class is defined not object
@apple   //decorator  it is kind of shortcuts to make taslk easy and reduce repative code
class Student {
    constructor() {
        console.log("student class");
    }
}

new Student();
