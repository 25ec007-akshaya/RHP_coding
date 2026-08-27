#include <iostream>
#include <set>

using namespace std;

void solve(){
	int l,q;
	cin>>l>>q;
	
	set<int> st = {0,l};
	
	while(q--){
		
		int qt , x;
		cin>>qt>>x;
		
		if (qt == 1){
			st.insert(x);
		}
		
		else{
			auto it = st.upper_bound(x);
			cout << *it - *(prev(it)) << endl;
		}
		
	}
}

int main(){
	solve();
}
