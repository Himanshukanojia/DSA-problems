class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1) return 0;
        int ans = 1;
        for(int curr =n ; curr >1;curr--){
            int total = (int) Math.pow(2,(curr-1));
            int half = total /2;
            if(k > half){
                ans = 1- ans;
                k -= half;
            }
        }
        if(ans != 0) return 0;
        return 1;
    } 
}
