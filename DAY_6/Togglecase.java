import java.util.*;
public class toggle_case {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
                ch=(char)(ch-32);
            else if(ch>='A' && ch<='Z')
                ch=(char)(ch+32);

            str+=ch;
        }
        System.out.print(str);
    }
}
