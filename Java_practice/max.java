public class max {
    public static void main(String[] args) {
        int a[]={4,2,56,1};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

            
        }
        System.out.println(max);
    }
    
}
