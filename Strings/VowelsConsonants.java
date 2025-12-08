//Count Vowels and Consonants



public class VowelsConsonants {
    public static void main(String[] args) {
        int Vowels=0,Consonants=0;
        int countVowels=0, countconsonants=0;
        String s1="Harish";
        s1=s1.toLowerCase();
        for(int i=0;i<=s1.length()-1;i++){
            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countVowels++;
            }
            else{
                countconsonants++;
            }
        }
        System.out.println("Vowels "+ countVowels);
        System.out.println("consonants "+ countconsonants);

    }
    
}
