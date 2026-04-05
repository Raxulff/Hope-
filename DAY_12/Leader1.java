// Geeks for Geeks Leaders in a array

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        ans.add(arr[n-1]);
        int max = arr[n-1];
        for(int ind = n-2;ind >= 0;ind--){
            if(max <= arr[ind]){
                max = arr[ind];
                ans.add(max);
            }
        }      
        return reverse(ans);
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int ind = list.size()-1;ind >= 0;ind--){
            temp.add(list.get(ind));
        }
        return temp;
    }
}
