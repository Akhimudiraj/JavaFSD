//Remove Duplicates from String


public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1="Harish";
        s1=s1.toLowerCase();
        String result="";
        
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(result.indexOf(ch)==-1){
                result=result+ch;
            }


        }
        System.out.println("after removing duplicates "+result);

    }
    
}
