var studentservice = /** @class */ (function () {
    function studentservice() {
        this.students = [];
    }
    //add
    studentservice.prototype.add = function (student) {
        this.students.push(student);
    };
    //getall
    studentservice.prototype.getAll = function () {
        return this.students;
    };
    //get by name
    studentservice.prototype.getbyName = function (name) {
        return this.students.find(function (s) { return s.name === name; });
    };
    //update 
    studentservice.prototype.update = function (id, marks) {
        var s = this.students.find(function (st) { return st.id === id; });
        if (s)
            s.marks = marks;
    };
    //delete
    studentservice.prototype.delete = function (name) {
        this.students = this.students.filter(function (s) { return s.name !== name; });
    };
    return studentservice;
}());
var abc = new studentservice();
abc.add({ id: 1, name: "Apasham", marks: 100 });
abc.add({ id: 2, name: "michel jackson", marks: 90 });
abc.update(2, 55);
abc.delete("Apasham");
console.log(abc.getAll());
