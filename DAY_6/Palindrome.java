public class Palindrome {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "moon";
        boolean res1 = palind(str1);
        boolean res2 = palind(str2);
        if(res1){
            System.out.println("STRING 1 PALINDROME");
        }
        if(res2){
            System.out.println("STRING 2 PALINDROME");
        }
        if(res1){
            System.out.println("STRING 1 IS NOT PALINDROME");
        }
        if(res2){
            System.out.println("STRING 2 IS NOT PALINDROME");
        }
        
    }
    public static boolean palind(String str){
        int n = str.length();
        for(int ind1 = 0,ind2 = n-1;ind1 < ind2;ind1++,ind2--){
            char ch1 = str.charAt(ind1);
            char ch2 = str.charAt(ind2);
            if(ch1 != ch2) return false;
        }
        return true;
    }
}

