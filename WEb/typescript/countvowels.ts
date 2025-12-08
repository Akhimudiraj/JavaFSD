class vowels{
    display(name:string):number{
        let count=0;
        let vowels="aeiouAEIOU";
        for(let char of name){
            if(vowels.includes(char)){
                count++;
            }
        }
        return count;
    }
}

let ans=new vowels();
console.log(ans.display("appleelephant"));
 
