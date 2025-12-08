// first show menu
//order items
//delieverd

/*
 * 10. Online Order Tracking System
 Concepts: Concepts: HashMap, ArrayList
 • Order – orderId, productName, status
 • OrderQueue – maintains pending/completed orders
 • OrderService – update status
 • OrderApp – simulate order placement and tracking
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class menu{
    HashMap<Integer,String> items=new HashMap<>();

    menu(){
        items.put(1, "Milkshake");
        items.put(2, "Pizza");
        items.put(3, "Pasta");
        items.put(4, "Gulab Jamun");
    }

    void showmenu(){
        menu m= new menu();
        System.out.println("==========");
        System.out.println("1"+items.get(1));
        System.out.println("2"+items.get(2));
        System.out.println("3"+items.get(3));
        System.out.println("4"+items.get(4));
        System.out.println("============");
    }

    

}




public class OnlineOrder {
    public static void main(String[] args) {
        ArrayList <menu> al= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int ch1,ch2,ch3=0;
        menu m= new menu();
        al.add(m);

        do {
            System.out.println("============");
            System.out.println("1.show menu");
            System.out.println("2.Order items");
            System.out.println("3.Track the order");
            System.out.println("4.exit");
            System.out.println("============");
            ch1=sc.nextInt();

            if(ch1==1){
                System.out.println("============");
                System.out.println("available items");
                m.showmenu();
                System.out.println("============");
            }

            if(ch1==2){
                m.showmenu();
                System.out.println("============");
                System.out.println("enter item no to order");
                System.out.println("============");
                int item=sc.nextInt();

                

                if(item==1){
                    System.out.println("============");
                    System.out.println("ordered milkshake");
                    System.out.println("============");
                }
                if(item==2){
                    System.out.println("============");
                    System.out.println("orderd pizza");
                    System.out.println("============");
                }
                if(item==3){
                    System.out.println("============");
                    System.out.println("orderd pasta");
                    System.out.println("============");
                }
                if(item==4){
                    System.out.println("============");
                    System.out.println("orderd gulabjamun");
                    System.out.println("============");
                }

                if(item>4){
                    System.out.println("============");
                    System.out.println("Invalid item");
                    System.out.println("============");
                }


               
                

            }
            
            if(ch1==3){
                System.out.println("============");
                System.out.println("enter the item id to track");
                System.out.println("============");
                int item=sc.nextInt();

                if(m.items.containsKey(item)){
                    System.out.println("============");
                    System.out.println("delieverd");
                    System.out.println("============");
                }else{
                    System.out.println("============");
                    System.out.println("not deliverd");
                    System.out.println("============");
                }

            }

            if(ch1==4){
                System.out.println("============");
                System.out.println("Thank u");
                System.out.println("============");
            }
        } while (ch1!=4);
        
    }
    
}
