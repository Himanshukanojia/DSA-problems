class Solution {
    public int numTrees(int n) {
       return method(n);
    }
    int method(int n){
        int ans[]=new int[n+1];
        ans[0]=ans[1]=1;
        for(int i=2;i<=n;i++){
            ans[i]=0;
            for(int j=0;j<i;j++){
                ans[i]+=ans[j]*ans[i-j-1];
            }
        }
        return ans[n];
    }
}