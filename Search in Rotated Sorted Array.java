class Solution {
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length-1,mid =0;
        while(l <= r){
            mid = (l+r)/2;
            if(nums[mid] < nums[l]){
                if(target > nums[mid] && target <= nums[r]) l = mid +1;
                else r = mid -1;
            }
            else {
                if(target < nums[mid] && target >= nums[l]) r = mid-1;
                else l = mid +1;
            }
           if(nums[mid] == target) return mid; 
        }
        return -1;
    }
}
