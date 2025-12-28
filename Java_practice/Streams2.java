import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Streams2 {
    public static void main(String[] args) {
     int a[]={1,2,3,4,5,6};
        Arrays.stream(a)
        .filter(n->n%2==0)
        . forEach(System.out::println);
    }
    
}
