/*
 *  2. Shopping Cart System
 Concepts: Concepts: ArrayList, HashMap, Iterator
 • Product – id, name, price
 • Cart – Map
 • CartService – add/remove/view cart items
 • ShoppingApp – main runner class
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class cart{
    Scanner sc= new Scanner(System.in);
    int id;
    String name;
    double price;
    cart(){
        System.out.println("enter id");
        id=sc.nextInt();
        sc.nextLine();

        System.out.println("enter name");
        name= sc.nextLine();
       
        System.out.println("enter price");
        price=sc.nextDouble();

    }

    void cartDisplay(){
        System.out.println("===========");
        System.out.println("Id "+id);
        System.out.println("name "+name);
        System.out.println("price "+price);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        int ch1,ch2,ch3=0;
        Scanner sc= new Scanner(System.in);
        ArrayList <cart>al=new ArrayList<>();
        HashMap <Integer,cart> hm=new HashMap<>();
        do {
            System.out.println("1. Add to cart");
            System.out.println("2. Remove from cart by item id");
            System.out.println("3. view cart items by id");
            System.out.println("4. exit");
            ch1=sc.nextInt();

            if(ch1==1){
                cart c= new cart();
                al.add(c);
                hm.put(c.id, c);
                // al.add(new cart());
                System.out.println("Items added to cart");
            }

            if(ch1==2){

                if(hm.isEmpty()){
                    System.out.println("cart is empty");
                }else{
                      System.out.println("enter id to remove item");
                      int id=sc.nextInt();
                      for(int i=0;i<al.size();i++){
                       if(al.get(i).id==id){
                        al.remove(i);
                        hm.remove(id);
                        System.out.println("item removed ");
                    }
                }

                }


              
            }

            if(ch1==3){

                if(hm.isEmpty()){
                    System.out.println("cart is empty");
                }else{
                     System.out.println("enter id to view the item");
                int id=sc.nextInt();

                if(hm.containsKey(id)){
                    cart c=hm.get(id);
                    c.cartDisplay();
                    System.out.println("items displayed");
                }

                }
               


            }

            if(ch1==4){
                System.out.println("Thank you");
            }
            
        } while (ch1!=4);
    }
    
}
