public class min {
    public static void main(String[] args) {
        int a[]={4,2,3,1};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                
            }
           
        }
         System.out.println(min);
    }
    
}
