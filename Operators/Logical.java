public class Logical {
    public static void main(String[] args) {
      int a=10,b=20;
      if(a<b && a!=b){
        System.out.println("and operator");
      }

      if (a!=b ||a>b) {
        System.out.println("Or operator");
      }

      boolean result = (a!=b);
      System.out.println(result);
      System.out.println(!result);
    }
    
}
