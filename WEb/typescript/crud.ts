interface Student{
    id:number;
    name:string;
    marks:number;
}

class studentservice{
    private students: Student[]=[];

    //add
    add(student:Student){
        this.students.push(student);
    }
    //getall

    getAll(){
        return this.students;
    }

    //get by name

    getbyName(name:string){
        return this.students.find(s=>s.name===name);
    }

    //update 
    update(id:number,marks:number){
        let s=this.students.find(st=>st.id===id);
        if(s) s.marks=marks;
    }

    //delete

    delete(name:string){
        this.students=this.students.filter(s=> s.name!== name);
    }
}

let abc=new studentservice();
abc.add({id: 1, name: "Apasham", marks: 100});
abc.add({id: 2, name: "michel jackson", marks: 90});
abc.update(2,55);
abc.delete("Apasham");

console.log(abc.getAll());
