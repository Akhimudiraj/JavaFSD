public class removeduplicate {
    public static void main(String[] args) {
     String name="madam";
     String result="";
     for(int i=0;i<name.length();i++){
        char ch=name.charAt(i);
        if(result.indexOf(ch)==-1){
            result=result+ch;

        }
     }
     System.out.println(result);

        
    }
    
}
