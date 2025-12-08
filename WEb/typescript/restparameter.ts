// class restparameter{

//      display(...nums:number[]){
//         let totalsum=0;

//         for(let number of nums){
//             totalsum+=number;
            
//         }
//         return totalsum;
//     }
// }

// let a= new restparameter;
// console.log(a.display(1,2,3,4));
// console.log(a.display(1,2));



function sum(...nums:number[]){
    
        let totalsum=0;

        for(let number of nums){
            totalsum+=number;
            
        }
        return totalsum;
    }

    console.log(sum(1,2,3,4));




 



