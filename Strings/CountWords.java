// Count Words in a Sentence

public class CountWords {
    public static void main(String[] args) {
        String s1="Strings stores in heap memory";
        int count=0;
        s1=s1.trim();
        String[] s2=s1.split(" ");
        count=s2.length;
        System.out.println(count);
    }
    
}
