import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;


class practise{
    public static void main(String[] args) {
        List <Integer> nums= Arrays.asList(1,5,8,99,54,56,2,3,1,5,91); //99,91,56,54,8,...

    //     //print all elements

    //     System.out.println("====for each method==");
    //     nums.stream().forEach(System.out::println);

    //     System.out.println("println method");
    //     nums.stream().forEach(n->System.out.println(n));
        
    //     //filter even elements

    //     System.out.println("==even numbers==");
    //     nums.stream().filter(n->n%2==0).forEach(System.out::println);

    //     //square of each number n*n 1*1 

    //     System.out.println("==square==");
    //     nums.stream().map(n->n*n).forEach(System.out::println);

    //     //remove duplicates

    //      System.out.println("===remove the duplicates");
    //     nums.stream().distinct().forEach(System.out::println);

    //     //count >50 

    //     System.out.println("==count greater than 50");
    //     long count=nums.stream().filter(n->n>50).count();
    //     System.out.println(count);

    //     //sort ascending
    //     System.out.println("===Ascending====");
    //     nums.stream().sorted().forEach(System.out::println);

    //     //descending
    //     System.out.println("==descending===");
    //     nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    //     //maximum
    //     System.out.println("==maximum==");
    //     int maxx=nums.stream().max(Integer::compare).get();
    //     System.out.println("max "+maxx);

    //     //minimum
    //    System.out.println("==minimum==");
    //     int minn=nums.stream().min(Integer::compare).get();
    //     System.out.println("min "+minn);

    //     //sum of all numbers
    //     System.out.println("==sum===");
    //     int sum=nums.stream().mapToInt(Integer::intValue).sum(); //stram to intstream
    //     System.out.println("sum "+sum);


    //     //convert string to uppercase //lowercase 
         List<String> names=Arrays.asList("Harish","Saketh","Vikas","Nikhil","madam","Akhi","Akhi","dan","bo");
          //List<String> names=Arrays.asList("Harish","Saketh","Vikas","Nikhil","Akhi","Akhi","dan","bo");
         //null exception ...
    //     names.stream().map(String::toLowerCase).forEach(System.out::println);

        //join names with +
        // System.out.println("join names with ++");
        // String joined=names.stream().collect(Collectors.joining("{} "));
        // System.out.println("joined "+joined);

        //limit first 3 num

        // System.out.println("==limit first 3 numbers===");
        // nums.stream().limit(3).forEach(System.out::println);

        // //skip 1st 2 numbers
        // System.out.println("==skip first 2 numbers");
        
        // System.out.println("1,5,8,99,54,56,2,3,91");
        // nums.stream().skip(4).forEach(System.out::println);

        // //check > 10
        // System.out.println("greater than 10");
        // long greaterthan10=nums.stream().filter(n->n>10).count();
        // System.out.println("greater than 10 "+greaterthan10);

        // //average of numbers
        // System.out.println("==average of numbers");

        // double avg=nums.stream().mapToDouble(n->n).average().getAsDouble();

        // System.out.println("average "+avg);

        // //names starting with 'A'
        // names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);

        // //convert strings to length

        // System.out.println("==strings to length===");
        // int len=names.stream().mapToInt(String::length).sum();
        // System.out.println("length "+len);


        // //multiply numbers by 10

        // System.out.println("==multiply by 10===");
        // nums.stream().map(n->n*10).forEach(System.out::println);

        // //filter with condition and then sort names 

        // names.stream().filter(n->n.length()>3).sorted().forEach(System.out::println);

        // //collect squares into set
        // System.out.println("====collect squares into set====="); 
        // Set<Integer> squares=nums.stream().map(n->n*n).collect(Collectors.toSet());
        // System.out.println("squares "+squares);


        // //distinv=ct even numbers
        // System.out.println("===distinv=ct even numbers===");
        // nums.stream().filter(n->n%2==0).distinct().forEach(System.out::println);


        // //sort by string length
        // System.out.println("===sort by string length====");
        // names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


        // //second highest 

        // System.out.println("===second highest ===");
        // int second=nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        // System.out.println("second highest "+second);

        // //merge 2 list
        // List<Integer> l1=Arrays.asList(1,2,3,4,5); 
        // List<Integer> l2=Arrays.asList(6,7,8,9);

        // List<Integer> merged=Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());

        // System.out.println("merged "+merged);

        // //remove null values
        // System.out.println("===null values===");

        // names.stream().filter(Objects::nonNull).forEach(System.out::println);


        // //word frequency
        // System.out.println("====word frequency=====");
        // Map<String,Long> wordfr=names.stream().collect(Collectors.groupingBy(word-> word,Collectors.counting()));
        // System.out.println(wordfr);

        // //map values to list
        // System.out.println("=====map values to list=======");

        // Map<Integer,String>mapp=Map.of(1, "APple", 2, "Ball", 3, "grapes");
        // mapp.values().stream().collect(Collectors.toList());
        // System.out.println("values "+mapp);

        // //reverse sorted names
        // List<String> names=Arrays.asList("Harish","Saketh","Vikas","Nikhil","Akhi","Akhi","dan","bo");
        // System.out.println("===reverse sorted names===");
        // names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // //pallindrome words
        // System.out.println("===pallindrome===");
        // names.stream().filter(w->w.equalsIgnoreCase(new StringBuilder(w).reverse().toString())).forEach(System.out::println);   

        // //top 3 highest numbers

        // nums.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


        // int arr[]={123,345,567};
        // List<Integer> lll=arr.stream()

      













        



     




        
        
    }
}