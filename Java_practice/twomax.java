import java.util.Arrays;

public class twomax {
    public static void main(String[] args) {
        int a[]={12,55,64,8,4,55,94,23};
        // int max=a[0];
        // int secondmax=a[1];
        // for(int i=0;i<a.length;i++){
        //     if(a[i]>max){
        //         secondmax=max;
        //         max=a[i];
        //     }else if(a[i]>max && a[i]<secondmax){
        //         secondmax=a[i];
        //     }
        // }
        // System.out.println("1st max "+max);
        // System.out.println("2nd max "+secondmax);
        Arrays.sort(a);
        System.out.println(a[7]);
        System.out.println(a[6]);
    }
    
}
