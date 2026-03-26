import java.util.*;
public class Remove_space_without_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){  
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
