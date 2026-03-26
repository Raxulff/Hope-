import java.util.*;
public class Lower_to_upper {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            s+=ch;
        }
        System.out.print(s);
    }
}
