import java.util.ArrayList;
import java.util.Iterator;

class Collection1 {
    public static void main(String[] args) {
        ArrayList<Object>  al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add("akhi");
        System.out.println(al);

        Iterator<Object> i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
