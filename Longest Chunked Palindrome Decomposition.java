class Solution {
    public int longestDecomposition(String text) {
        int n = text.length();
        for(int i=0;i<n/2;i++)
        if(text.substring(0,i+1).equals(text.substring(n-i-1,n)))
        return 2+longestDecomposition(text.substring(i+1,n-i-1));
        return (n==0) ?0 : 1;
    }
}
