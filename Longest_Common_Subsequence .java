class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        int r = text1.length() , c = text2.length();
        vector<vector<int>> dp(r+1 , vector<int>(c+1 , 0));
        for(int row = 1 ; row<= r ; row++){
            for(int col = 1 ; col<=c ; col++){
                if(text1[row-1]==text2[col-1]){
                    dp[row][col] = 1+dp[row-1][col-1];
                }
                else{
                    dp[row][col] = max(dp[row][col-1],dp[row-1][col]);
                }
            }
        }
        return dp[r][c];
        
    }
};
