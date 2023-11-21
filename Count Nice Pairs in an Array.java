class Solution {
    public int countNicePairs(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i] = nums[i] - rev(nums[i]);

        Map<Integer,Integer> map = new HashMap<>();
        int ans =0;
        int mod = (int) 1e9+7;
        for(int num : arr){
            ans = (ans + map.getOrDefault(num,0)) % mod;
            map.put(num,map.getOrDefault(num,0) +1);
        }
        return ans;
    }
    int rev(int n){
        int reve =0;
        while(n>0){
            reve = n%10 + reve*10;
            n /= 10;
        }
        return reve;
    }
}
