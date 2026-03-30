package DAY_8_Task;

public class Secondmaxchar {
    public static void main(String[] args){
        String str = "aabbbc";
        
        int max = -1;
        int sec_max = -1;
        char max_ch = '-';
        char sec_ch = '-';
        for(int ind1 = 0;ind1 < str.length();ind1++){
            boolean seen = false;
            for(int ind2 = 0;ind2 < ind1;ind2++){
                if(str.charAt(ind1) == str.charAt(ind2)){
                    seen = true;
                    break;
                }
            }
            if(seen) continue;
            int count = 1;
            for(int ind3 = ind1+1;ind3 < str.length();ind3++){
                if(str.charAt(ind1) == str.charAt(ind3)){
                    count++;
                }
            }
            if(max < count){
                sec_max = max;
                sec_ch = max_ch;
                max = count;
                max_ch = str.charAt(ind1);
            }else{
                if(sec_max < count){
                    sec_max = count;
                    sec_ch = str.charAt(ind1);
                }
            }
        }
        System.out.println(sec_ch);
    }
}
