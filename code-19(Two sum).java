class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer> ;
        for(int i = 0 ; i< nums.size();i++){
          int need = target - nums[i];
          if(m.containsKey(need)){
            return {m.get(need) ,i};
          }
          else {
            m.put(nums[i] , i); 
          }

        }
        return int[]{-1,-1};
    }
}

