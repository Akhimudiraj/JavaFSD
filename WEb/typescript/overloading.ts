// class overload{
//     demo1(num:number):void{
//         console.log("one paramter");
        
//     }

//     demo1(num:number,name:string):void{
//         console.log("2 parameters");
        

//     }
// }

// let ans= new overload();
// console.log(ans.demo1(2));
// ;


function demo(x:number):void;
function demo(x:string):void;

function demo(x:any){
    console.log("value "+x);
    
}

demo(10);
demo("hello")