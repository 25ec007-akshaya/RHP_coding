#include<iostream>
#include <vector>
using namespace std;
const int diff[5] = {0,-1,0,1,0};
void dfs(int R , int C , int row , int col , vector<string>& g){
    g[row][col] = '#';
    for(int i = 0 ;i<4 ; i++){
        int ar = row+diff[i];
        int ac = col +diff[i+1];
        if(ar>=0 && ar<R && ac>=0 && ac <C && g[ar][ac]=='.'){
            dfs(R,C,ar,ac,g);
        }
    }
}
 
int main(){
    int r , c ;
    cin>>r>>c ;
    vector<string> grid(r);
    for(int i=0 ;i<r ; i++) cin>>grid[i];
    int rooms = 0;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (grid[i][j] == '.') {
                rooms++;
               dfs(r,c,i,j,grid);
            }
    }
}
cout<<rooms ;
}
