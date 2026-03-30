class CountAndSay {
    public String countAndSay(int n) {
        String res = "1";
        for(int i=2; i<=n; i++){
            StringBuilder temp = new StringBuilder();
            int count=1;
            for(int j=1; j<res.length(); j++){
                if(res.charAt(j)==res.charAt(j-1)) count++;
                else{
                    temp.append((char)(count+'0'));
                    temp.append(res.charAt(j-1));
                    count=1;
                }
            }
            temp.append((char)(count+'0'));
            temp.append(res.charAt(res.length()-1));
            res=temp.toString();
        }
        return res; 
    }
}
