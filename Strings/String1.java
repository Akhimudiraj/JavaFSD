class String1{
    public static void main(String[] args) {
        String a="rahul is a trainer";

        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        a.trim();
        System.out.println(a.trim().length());
        
        String name1="Thanesh";
        String name2="tanesh";
        System.out.println(name1==name2);
        System.out.println(name1.equalsIgnoreCase(name2));

        String words[]=a.split(" ");

        for(String st: words){
            System.out.println(st);
        }

        System.out.println("________________");
        
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("_______________");

        for(int x:arr){
            System.out.println(x);
        }
    }
}