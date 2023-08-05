class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean dp[] = new boolean[n+1];
        dp[0] = true; 
        int max = 0;
        for(String word : wordDict) max = Math.max(max,word.length());
        for(int i =1;i<=n;i++){
            for(int j=i-1;j>=Math.max(i-max-1,0);j--){
                if(dp[j] && wordDict.contains(s.subString(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}