#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
#include <queue>
#include <utility>
#include<set>
#define ll long long int
#define INF 2e9
using namespace std;

void solve(){
	int N; cin >> N;
	vector<int> arr;
	while(N--){
		int a;
		cin >> a;
		arr.push_back(a);
	}
	ll ans = 0;
	sort(arr.begin(),arr.end());
	for(int x : arr){
		auto upp_it = upper_bound(arr.begin(),arr.end(),x);
		auto low_it = lower_bound(arr.begin(),arr.end(),x);
		int less = low_it - arr.begin();
		int upp = arr.end() - upp_it;
		//cout << x <<" "<<less<<" "<<upp<<endl;
		ans +=1LL * less * upp;
	}
	cout<<ans;
}		
	
	
	
	
	
			
int main(){
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int tc=1;
	//cin >> tc;
	while(tc--) solve();
}
