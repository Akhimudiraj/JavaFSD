package AccessModifiers;

public class accessmodiers1 {
    public int a=100; //anywhere 
    private int b=200;//single class
    protected int c=300;//same package+subclass(otherpack)
    int d=400; //anywhere but only in same package

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
