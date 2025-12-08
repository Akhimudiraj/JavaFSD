class A{
    int a=100;
    int b=200;
    void m1(){
        System.out.println(a+b);
    }
}

class B extends A{
    int b=200;
    int c=300;
    void m2(){
        System.out.println(a+c);
    }
}





class Inheritance{
    public static void main(String[] args) {
        A a= new A();
        a.m1();
        B b= new B();
        b.m2();
    }

}