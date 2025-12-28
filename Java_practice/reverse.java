public class reverse {
    public static void main(String[] args) {
        String a="akhi";
        String temp=a;
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
        if(rev==temp){
            System.out.println("it is pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
    
}
