public class pallindrome {
    public static void main(String[] args) {
        int n=121;
        int temp=n;
        int extracted=0;
        int ans=0;
        while(n>0){
            extracted=n%10;
             ans=ans*10+extracted;
             n=n/10;


        }
        if(temp==ans){
            System.out.println("it is palli");
        }else{
            System.out.println("it is not");
        }

    }
    
}
