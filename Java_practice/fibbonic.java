
public class fibbonic {
    public static void main(String[] args) {
    
        //1 1 2 3 5 8
      int n1=0,n2=1,temp=0;
     for(int i=0;i<=10;i++){
        temp=n1+n2;
        n1=n2;
        n2=temp;
        System.out.println(temp);
     }
  
        

    }
    
}
