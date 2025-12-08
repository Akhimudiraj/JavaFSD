class x{
    x(){
        this(100);
        System.out.println("hi x constuctor");
    }
    x(int a){
        this(100,200);
        System.out.println("hi x(int a) constructor");
    }
    x(int a, int b){
        System.out.println("hi x(int a, int b) constructor");
    }
    void abc(){
        System.out.println("hi abc method");
        this.xyz();
    }
    void xyz(){
        System.out.println("hi xyz method");
    }
}



public class poly2 {
    public static void main(String[] args) {
        x xx=new x();
        xx.abc();

    }
    
}
