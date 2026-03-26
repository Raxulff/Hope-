import java.util.*;
public class count_of_character {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        int d=0;
        int sp=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' && ch>='A' && ch<='z'){
                a++;
            }
            else if(ch>='0' && ch<='9') d++;
            else sp++;
        }
        System.out.println(a);
        System.out.println(d);
        System.out.print(sp);
    }
}
