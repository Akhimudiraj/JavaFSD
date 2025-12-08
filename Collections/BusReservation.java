import java.util.HashMap;
import java.util.Scanner;

class passenger{
    Scanner sc= new Scanner(System.in);
    int id;
    String name;
    int age;

    passenger(){
        System.out.println("enter id");
        id=sc.nextInt();
        sc.nextLine();

        System.out.println("enter name");
        name=sc.nextLine();

        System.out.println("enter age");
        age=sc.nextInt();

    }

    void displayPassenger(){
        System.out.println("==============");
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("age "+age);
    }


}

class busdetails{
    Scanner sc= new Scanner(System.in);
    int busno;
    String destination;
    int seats;

    busdetails(){
        System.out.println("enter busno");
        busno= sc.nextInt();
        sc.nextLine();

        System.out.println("enter bus destination");
        destination=sc.nextLine();

        System.out.println("enter seats");
        seats=sc.nextInt();


    }

    void displayBus(){
        System.out.println("===========");
        System.out.println("busno "+busno);
        System.out.println("destination "+destination);
        System.out.println("seats "+seats);
    }

}



public class BusReservation {
    public static void main(String[] args) {
        //queue linkedlist hashmap

        HashMap <Integer,busdetails>hm= new HashMap<>();
        
        hm.put(1,new busdetails());
        hm.put(2, new busdetails());
        hm.put(3, new busdetails());

        




    }
    
}
