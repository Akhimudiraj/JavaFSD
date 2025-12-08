class A{
    // A(){
    //     System.out.println("A class");
    // }
    //byte aa=100;
     int aa=100;
    // short aa=200;
    // long aa=400;
    // float aa=100;
    // double aa=200;

    void display(){
        System.out.println(" A class method"+aa);

    }
    // int roi()
    // {
    //     return 10;
    // }
    // void A(){}
}

// class B{
//     B(){
//         System.out.println("B class");
//     }
// }



class demo5{
    public static void main(String[] args) {
       
        A a= new A();
        a.display();
        // a.display();
        // System.out.println(a.roi());
        // B b= new B();
        
    }

}