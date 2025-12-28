import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.*;
import java.util.stream.Collectors;

class Streams{
    public static void main(String[] args) {
        List <Integer> li= new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);

        System.out.println(li);


        // List <Integer> ans=li.stream()
        //                      .filter(n->n%2==0)
        //                      .forEach(System.out::println);

        List <Integer> ans=li.stream()
                              .filter(n->n%2==0)
                              .collect(Collectors.toList());
        System.out.println(ans);

        li.stream()
           .map(n->n*n)
           .forEach(System.out::println);

         Long count=  li.stream()
           .filter(n->n%1==0)
           .count();
           System.out.println(count);


        
        

                

    }
}