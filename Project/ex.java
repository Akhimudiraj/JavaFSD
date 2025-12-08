class A{
    int a=100;
    void display(){
        System.out.println("hi display method");
    }
    static int b=200;
    static void abc(){
        System.out.println("hi abc method");
    }
}



public class ex {
     
   
    public static void main(String[] args) {
        System.out.println(A.b);
        System.out.println();
        A.abc();
        
    }
    
}
