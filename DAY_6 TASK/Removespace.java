
import java.util.*;
public class Remove_space_using_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') str+=ch;
        }
        System.out.println(str);
    }
}
