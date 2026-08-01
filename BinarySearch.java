class Solution {
    public int search(int[] nums, int target) {
        int lf = 0 , rt = nums.length -1 ;
        while(lf+1 <rt){
            int mid = (rt+lf)/2;
            if(nums[mid]< target) lf =mid ;
            else rt = mid ;
        }
        return (nums[lf]==target?lf:nums[rt]==target?rt:-1);
    }
}
