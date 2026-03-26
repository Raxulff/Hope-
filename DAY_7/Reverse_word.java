import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = "HI HELLO WORLD";
		int end = 0;
		int flag = 0;
		StringBuilder sb = new StringBuilder();
		for(int ind = str.length()-1;ind>= 0;ind--){
		    if(str.charAt(ind) == ' ' || ind == 0){
		        if(ind == 0){
		            sb.append(str.substring(ind,end+1)+" ");
		        }else{
		            sb.append(str.substring(ind+1,end+1)+" ");
		        }
		        flag = 0;
	
		    }else{
		        if(flag == 0){
		            flag = 1;
		            end = ind;
		        }
		    }
		}
		System.out.println(sb.toString());
	}
}

