class Solution {
    public int maxRotateFunction(int[] nums) {
       int sum = 0;
       int l = nums.length;
       long ans =0 , val =0;
       for(int i = 0 ; i<l;i++){
        sum+=nums[i];
        val += (nums[i]*i);
       } 
       ans = val ;
       for(int i = l - 1 ; i>0;i--){
        val = val - (nums[i]*(l-1)) + (sum - nums[i]);
        ans=Math.max(ans , val);
       }

    return (int)ans;

    }
}
