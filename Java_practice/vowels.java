class vowels{
    public static void main(String[] args) {
        String name="Apple";
        name=name.toLowerCase();
        int vowel=0;
        int consonont=0;
        for(int i=0;i<name.length();i++){
            char ch= name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
                

            }else{
                consonont++;
            }
        }
        System.out.println("vowels "+vowel);
        System.out.println("consonants "+consonont);
    }
}