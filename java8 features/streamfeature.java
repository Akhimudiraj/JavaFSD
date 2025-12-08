import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class streamfeature {
    public static void main(String[] args) {
        List <Integer> nums= Arrays.asList(1,2,3,4,5,5,6,2,90);

       Iterator i =nums.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //print --> reverse, forward, top, bottom, filter, char sort, count, min, max

        System.out.println("=====Print====");
        nums.stream().forEach(n->System.out.println(n));

        //stream(): A Stream in Java is a sequence of elements (like data from a collection) that supports functional-style operations — such as filtering, mapping, and reducing — without modifying the original data.

        System.out.println("====even====");

         System.out.println("----by foreach--------");
        nums.stream().filter(n->n%2==0).forEach(System.out::println);
        
        System.out.println("-------direct println------");
        nums.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
       

         System.out.println("====odd====");
        nums.stream().filter(n->n%2!=0).forEach(System.out::println);

        //filter check the condition and filter

        System.out.println("=== square===");
        nums.stream().map(n->n*n).forEach(System.out::println);
        //changes each number into square

        System.out.println("=====count numbers are greater than 50");
        long count=nums.stream().filter(n->n>50).count();
        System.out.println("count "+count);

        System.out.println("==sort====");
        List<Integer> sorts=nums.stream().sorted().collect(Collectors.toList());
        System.out.println("sort "+sorts);

        System.out.println("===remove the duplicates");
        nums.stream().distinct().forEach(System.out::println);

        System.out.println("===max===");
        int maxx=nums.stream().max(Integer::compare).get();
        System.out.println("max "+maxx);

         System.out.println("===min===");
        int minn=nums.stream().min(Integer::compare).get();
        System.out.println("min "+minn);




        
    }

    
}
