class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int r = nums1.length , c = nums2.length ;
        int dp[][] =new int[r+1][c+1] ;//defalt all will be 0
        int maxlen =0 ;
        for(int rw =1 ; rw <= r ;rw++){
            for(int cl = 1 ;cl <= c ; cl++){
                if(nums1[rw-1]== nums2[cl-1]){
                    dp[rw][cl] = 1+dp[rw-1][cl-1];
                    maxlen = Math.max(maxlen , dp[rw][cl]);
                }
            }
        }
        return maxlen ;
      }  
    }
