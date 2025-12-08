//abstraction hide 


// abstract class A{

//     //abstract methods 
   

//    abstract void sound();

//     //regular methods

//     void talk(){
//         System.out.println("talking");
//     }
// }

// //we cant create obj for abstract class

// class B extends A{

//     void sound(){
//         System.out.println(" abstract method it makes sound");
//     }

// }



//interface 


class AA{


    //normal methods 
    //no abstract methods 
    //abstract 

}

interface Vehicle{
    public void fuel();
    // public Vehicle(){
    //     System.out.println("interface constructor");
    // }
    public void typeofvehicle();
}


class car implements Vehicle{
   public void fuel(){
        System.out.println("diesel");
    }
  public  void typeofvehicle(){
        System.out.println("bmw");
    }
     
}

class Bike implements Vehicle{
    public void fuel(){
        System.out.println("petrol");
    }
    public void typeofvehicle(){
        System.out.println("pulsar");
    }

}



class Abstraction{
    public static void main(String[] args) {
      
       car c= new car();
       c.fuel();
       c.typeofvehicle();

       Bike b= new Bike();
       b.fuel();
       b.typeofvehicle();

        
    }

}