
import java.util.*;
import java.util.stream.Collectors;



class StreamsPrograms {
    public static void main(String[] args) {
        //print all even numbers 
        //1st way
  List<Integer> li=Arrays.asList(1,2,3,4,5,4,6);
//Set<Integer> li=new HashSet<>(Arrays.asList(1,2,3,4,3,4,5,6));
   li.stream()
     .filter(n->n%2==0)
     .forEach(System.out::println); //[2, 4, 4, 6]
     System.out.println("=======");
     
     //2nd way
    List<Integer>li2=li.stream().filter(n->n%2==0).toList();
    System.out.println(li2); //[2, 4, 4, 6]
//====================================================================
    //print odd numbers
    //1st way
    List<Integer> odd=Arrays.asList(1,2,3,4,5,6,7,8,9);
    odd.stream().filter(n->n%2!=0).forEach(System.out::println); //[1, 3, 5, 7, 9]
    //2nd way
    List<Integer> odd2=odd.stream().filter(n->n%2!=0).toList();
    System.out.println(odd2); //[1, 3, 5, 7, 9]
    
//=======================================================================
//to uppercase
List<String> names=Arrays.asList("Akhi","Saketh","vikas");
names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
//to lowercase
names.stream().map(n->n.toLowerCase()).forEach(System.out::println);

//using set
Set<String > names2=new HashSet<>(Arrays.asList("akhi","harish","akhi","robert"));
names2.stream().map(n->n.toUpperCase()).forEach(System.out::println);
names2.stream().map(n->n.toLowerCase()).forEach(System.out::println);


//=========================================================================

//remove duplicates 
//1st add numbers in arrays then remove duplicates
List<Integer> al= new ArrayList<>();
al.add(10);
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(40);
al.add(30);
System.out.println(al);

Set<Integer> ss=new HashSet<>(al);
System.out.println(ss);

//============================================================================

//count numbers greater than 50
List<Integer>count= Arrays.asList(10,20,30,4,0,50,60,80,90,70,880,900,156);

//1st way to get all numbers which arre greater than 50
count.stream().filter(n->n>50).forEach(System.out::println);

//2nd way to get the count of that numbers
long count2=count.stream().filter(n->n>50).count();
System.out.println(count2);

//=============================================================================

//square of each number 

List<Integer> square=Arrays.asList(1,2,3,4,5,6,7,8);
square.stream().map(n->n*n).forEach(System.out::println);

//==============================================================================

//collect numbers into list which are greater than 10

Set<Integer> collect =new HashSet<>(Arrays.asList(10, 20, 50, 10, 60, 81, 0, 20, 50, 66, 4, 20, 90, 90));
List<Integer> collect2=collect.stream().filter(n->n>65).collect(Collectors.toList());
System.out.println(collect2); //[66, 81, 90]

//==========================================================================

//print numbers divisible by 3

List<Integer> sol=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20,21,22,23,24,25,26,27,28,29,30);
sol.stream().filter(n->n%3==0).forEach(System.out::println);

//another way to get as list
List<Integer> sol2=sol.stream().filter(n->n%3==0).collect(Collectors.toList());
System.out.println(sol2); //[3, 6, 9, 12, 15, 18, 21, 24, 27, 30]

//==========================================================================

//Find maximum number from a list
List<Integer> max= Arrays.asList(10,80,30,50,60,4);
int max2=max.stream().max(Integer::compareTo).get();
System.out.println(max2); //80

//==========================================================================

//Sum of all numbers using streams

List<Integer> sum=Arrays.asList(1,2,3,4,5,6,7,8,9);
int sum2=sum.stream().reduce(0,(a,b)->a+b);
System.out.println(sum2);








   
   
       
    }
}