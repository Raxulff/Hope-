//Leetcode 845
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int larMount = 0;
        for(int ind1 = 0;ind1 < n;ind1++){
            List<Integer> list = new ArrayList<>();
            for(int ind2 = ind1;ind2 < n;ind2++){
                list.add(arr[ind2]);
                if(list.size() > 2){
                    larMount = Math.max(len(list),larMount);
                }
            }
        }
        return larMount;
    }
    public static int len(List<Integer> list){
        int max = list.get(0);
        int max_ind = 0;
        int index = 0;
        for(int val : list){
            if(max < val){
                max = val;
                max_ind = index;
            }
            index++;
        }
        for(int ind = 0;ind < max_ind;ind++){
            if(list.get(ind) >= list.get(ind+1)) return 0;
        }
        for(int ind = max_ind;ind < list.size()-1;ind++){
            if(list.get(ind) <= list.get(ind+1)) return 0;
        }
        return list.size();
    }
}
