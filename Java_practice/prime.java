public class prime {
    public static void main(String[] args) {
        //prime 1 and its number
       for(int i=1;i<=10;i++){
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(i);
        }
       }
    }
    
}
