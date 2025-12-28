import java.util.*;
public class collections {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online



    public static void main(String[] args) {
        //Arraylist 
        //allows duplicate, maintains insertion order
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(410);
        System.out.println(list);
        
        //Linked list
        //same as arraylist , better for insertion and deletion
        
        List<String> names= new LinkedList<>();
           
        names.add("akhi");
        names.add("liki");
        names.add("choor");
        names.add("vikas");
        names.add("kilkil");
        System.out.println(names);
        names.remove("akhi");
        System.out.println(names);
        
        //vector (legacy, syncronized)
        Vector<Integer> vv= new Vector<>();
        vv.add(10);
        vv.add(22);
        vv.add(33);
        vv.add(44);
        System.out.println(vv);
        
        
        //Set INterface (No Duplicates)
        
        //Hashset 
        //no duplicates, no order
        
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        System.out.println(set);  //20 10 30 40
        
        
        //LinkendHashSet
        //NO duplicates, maintains order
        Set<String> set2= new LinkedHashSet<>();
        set2.add("apple");
        set2.add("ball");
        set2.add("apple");
        set2.add("grapes");
        System.out.println(set2);
        
         Set<Integer> set3= new LinkedHashSet<>();
        set3.add(20);
        set3.add(10);
        set3.add(40);
        set3.add(10);
        System.out.println(set3);


      //Tree Set
        //no duplicates, sorted order
        
        Set<Integer> set4= new TreeSet<>();
        set4.add(11);
        set4.add(88);
        set4.add(88);
        set4.add(18);
        set4.add(14);
        set4.add(12);
        set4.add(11);
        System.out.println(set4);
        
        Set<String> names1= new TreeSet<>();
        names1.add("saketh");
        names1.add("akhi");
        names1.add("vikas");
        names1.add("kilkil");
         System.out.println(names1);
         
         //Treeset with custom sort reverse order
         Set<Integer> custom= new TreeSet<>(Collections.reverseOrder());
         custom.add(10);
         custom.add(20);
         custom.add(50);
         custom.add(30);
         custom.add(40);
         System.out.println(custom);

           //Queue Interface (FIFO)
         
         //priority queue
         //orders elements
         //Not strictly FIFO
         //elements are ordered based on priority
         //for integers natural ascending order
         //allow duplicates
         //does not allow null

         
         Queue<Integer> q= new PriorityQueue<>();
         q.add(10);
         q.add(30);
         q.add(20);
         q.add(50);
         q.add(10);
         q.add(40);
         
         System.out.println(q); //[10, 10, 20, 50, 30, 40]

            //Map Interface (Key value pair)
       //map is not a collection 
       
       //HashMap
       //no order
       //key must be unique
       
          
       Map<Integer,String> map= new HashMap<>();
       map.put(1,"akhi");
       map.put(2,"ball");
       map.put(3,"akhi");
       map.put(4,"cat");
       map.put(4,"dog");
       System.out.println(map);
       
       //LinkendHashMap
       //maintains order, however u give like that only it prints
       
       Map<Integer,String> map2=new LinkedHashMap<>();
       map2.put(1,"ball");
       map2.put(3,"dog");
       map2.put(2,"apple");
       System.out.println(map2);
       
       //Iterator (Traverse collection)
       
       List<Integer> ll=Arrays.asList(1,2,3,4,5,6);
       Iterator<Integer> it= ll.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }


        //linear search 
       
      //works on sorted and unsorted order
      //array{10,20,50,15,30,18};
      //key{15}
      
      int [] arr={10,20,50,15,30,18};
      int key=15;
      boolean found=false;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==key){
              System.out.println("element found at "+i);
              found=true;
              break;
            
          }
      }
      if(!found){
          System.out.println("not found");
      }


         //binarysearch
   
   //works only on sorted order
//   divide rule low high mid=low+high/2

int [] arr2={10,15,20,30,40,55};
int key2=20;
int low=0;
int high=arr2.length-1;

while(low<=high){
    int mid=(low+high)/2;
    if(arr2[mid]==key2){
        System.out.println("found at "+mid);
        return;
    }else if(key2<arr2[mid]){
        high=mid-1;
    }else{
        low=mid+1;
    }
}
System.out.println("Element not found");



       
   
        
     
        
    }
}
    

