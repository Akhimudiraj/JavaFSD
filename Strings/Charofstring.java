//Print Each Character of a String


public class Charofstring {
    public static void main(String[] args) {
        String s="Harish";
        //for each
        for(char ch:s.toCharArray()){
            System.out.println(ch);
        }
        //for loop
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }
    }
    
}
