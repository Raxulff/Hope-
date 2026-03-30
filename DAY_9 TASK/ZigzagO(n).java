class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i =0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        boolean dir = false;
        int curr = 0;
        for(int i = 0; i<s.length();i++){
            sb[curr].append(s.charAt(i));
            if(curr == numRows -1 || curr == 0){
                dir =! dir;
            }
            if(dir){
                curr++;
            }
            else{
                curr--;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < sb.length; i++){
            res.append(sb[i]);
        }
        return res.toString();
    
    }
}