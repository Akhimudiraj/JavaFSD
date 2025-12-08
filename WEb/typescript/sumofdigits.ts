function sum(nums:number):number{
    let sum=0;
    while(nums>0){
        sum+=nums%10;
        nums=Math.floor(nums/10); //math.floor rounded to number 7.1 -> 7.0
    }
    return sum;
}

console.log(sum(123));
