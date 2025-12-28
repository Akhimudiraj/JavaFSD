
import java.util.Arrays;

public class twomin {
    public static void main(String[] args) {
        int a[]={1,45,6,18,5,46,3};
        int min=a[0];
        int secondmin=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                secondmin=min;
                min=a[i];
            }else if(a[i]>min && a[i]<secondmin){
                secondmin=a[i];
            }
        }
        System.out.println("1st min "+min);
        System.out.println("2nd min "+secondmin);






    //    int a[]={1,45,6,18,5,46,3};
    //    int min=a[0];
    //    int secondmin=a[1];
    //    for(int i=0;i<a.length;i++){
    //     if(a[i]<min){
    //         secondmin=min;
    //         min=a[i];

    //     }else if(a[i]>min && a[i]<secondmin){
    //         secondmin=a[i];

    //     }
    //    }
    //    System.out.println(min);
    //    System.out.println(secondmin);
    //    Arrays.sort(a);
    //    System.out.println(a[1]);
           
   }
    
}
