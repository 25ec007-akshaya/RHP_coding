class Solution {
    public int orangesRotting(int[][] grid) {
        int oranges = 0 ;
        int r = grid.length , c = grid[0].length ;
        Queue <int[]>q = new LinkedList<>();
        for(int row = 0 ; row<r;row++){
            for(int col = 0 ; col<c ;col++){
                if(grid[row][col]==2){
                    q.add(new int[]{row,col});
                }
                if(grid[row][col]!=0 ) oranges++ ;
            }
        }
        if(oranges == 0) return 0 ;
        int diff[] = {0,1,0,-1,0};
        int days = -1 ;
        while(!q.isEmpty()){
            days++;
            int qsize = q.size();
            while(qsize -- > 0){
                oranges -- ;
                int cell[] = q.poll();
                int row = cell[0] , col = cell[1];
                for(int i = 0 ; i<4;i++){
                    int ar = row+diff[i];
                    int ac = col +diff[i+1];
                    if(ar>=0 && ar<r &&ac>=0 && ac<c && (grid[ar][ac] == 1)){
                        q.add(new int []{ar,ac});
                        grid[ar][ac]=2;
                    }
                }
            }
        }
        return oranges>0?-1:days ;
    }
}
