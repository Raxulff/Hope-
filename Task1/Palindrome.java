class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        String temp = x+"";
        return temp.equals(sb.toString());

    }
}