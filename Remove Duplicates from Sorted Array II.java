class Solution {
    public int removeDuplicates(int[] nums) {
    int n = nums.length;
    int k = 1, count = 1;
    for(int i = 1;i<n;i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
            count = 1;
        }
        else if(count < 2){
            nums[k] = nums[i];
            count++;k++;
        }
    }
    return k;
    }
}
