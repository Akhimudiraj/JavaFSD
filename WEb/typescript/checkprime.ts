function prime(num :number) {
    var count=0;

    for(let i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }

    }
    if(count==2){
        console.log("it is prime");
        
    }else{
        console.log("it is  not a prime");
        
    }

}

prime(4)