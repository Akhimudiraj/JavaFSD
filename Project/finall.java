//final class car : if the car is final we cant inheritate

class car{
    final int speed =200; //we can not re assign the values
    int model=2017;
    String color="red";

    final void gear(){
        System.out.println("5 gear car");
    }
}

class verna extends car{
    //@override
    //void gear(){ // 
    //System.out.println("model")
    //}

}

class BMW extends car{
    int model=2020;
    //@override
    ////void gear(){ // 
    //System.out.println("auto gear car")
    //}
}



public class finall {
    public static void main(String[] args){
        car c= new car();
        System.out.println(c.speed);
        //c.speed=2000; we cannot re assign the values
        // System.out.println(c.speed);
        verna v=new verna();
        v.gear();
        BMW b= new BMW();
        b.gear();
        System.out.println();
        System.out.println(b.model);
    }
    
}
