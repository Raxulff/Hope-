import java.util.*;
public class count_vowels_and_consonents {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowel=0;
        int consonent=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel++;
            else consonent++;
            }
        }
        System.out.println(vowel);
        System.out.print(consonent);
    }
}
