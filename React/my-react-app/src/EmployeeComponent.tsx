function EmployeeComponen(){
    let id:number=91;
    let fname:string="Akhi";
    let isActive:boolean=true; //local variables
    let skillset:Array<String>=["java","springboot","react","angular"]

    return (
        <>
        <p>this is employee class</p>
        <p>Employee id {id} name {fname} and status {isActive ?"Active ":"InActive"}</p>
        <p>skillset {skillset.join("")}</p>

        <ul>
            {skillset.map(s=> <li>{s}</li>)}
        </ul>
        </>
    );
}





export default EmployeeComponen