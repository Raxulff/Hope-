class Solution {
    public int lastRemaining(int n) {
        int step = 1;
        int head = 1;
        boolean left  = true;
        while(n > 1){
            // condition for head
            if(left || n%2 != 0){
                head = head + step;
            }
            n = n/2;
            step = step*2;
            left = !left;
        }
        return head;
    }
}
