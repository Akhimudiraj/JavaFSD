class Bank{
    Bank(){
        System.out.println("hi welcome to bank");
    }
    void roi(){
        System.out.println("10%");
    }
}

class sbi extends Bank{

}
class Axis extends Bank{

    void roi(){
        System.out.println("13% ");
    }
    
}






public class Poly {
    public static void main(String[] args) {
        sbi s= new sbi();
        s.roi();

        Axis a = new Axis();
        a.roi();
    }
    
}
