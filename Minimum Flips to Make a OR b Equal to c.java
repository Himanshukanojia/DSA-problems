class Solution {
    public int minFlips(int a, int b, int c) {
       int ans = 0;
       while(a>0 || b>0 || c>0){
           int bitA = a&1, bitB = b&1, bitC = c&1;
           if(bitC == 0)ans+=bitA +bitB;
           else if(bitA ==0 && bitB==0) ans+=1;

           a>>=1;b>>=1;c>>=1;
       }
       return ans;
    }
}
