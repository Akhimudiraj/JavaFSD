//Find Frequency of Each Character

public class Frequency {
    public static void main(String[] args) {
        String s1="Harish";
        s1=s1.toLowerCase();
       
        for(int i=0;i<=s1.length()-1;i++){
             int count=0;
            char ch=s1.charAt(i);
            if(s1.indexOf(ch)!=i)
            continue;

            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+"="+count);

            

        }
    }
    
}
