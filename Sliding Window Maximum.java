class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
           while(!dq.isEmpty() && nums[i] > dq.peekLast()) dq.pollLast();
           dq.addLast(nums[i]);
           if(i >= k && nums[i-k] == dq.peekFirst()) dq.pollFirst();
           if(i >= k-1) ans[i-k+1] = dq.peekFirst();
        }
        return ans;
    }
}
