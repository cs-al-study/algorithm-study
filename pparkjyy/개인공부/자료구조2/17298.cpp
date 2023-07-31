#include <iostream>
#include <stack>
#include<algorithm>
using namespace std;


int n;
stack<int> s;
int ans[1000001];
int seq[1000001];

int main() {
	
	cin >> n;

	for (int i = n-1; i >= 0; i--) {
		while (!s.empty() && s.top() <= seq[i])
			s.pop();
		if (!s.empty()) ans[i] = -1;
		else ans[i] = s.top();

		s.push(seq[i]);
	}
	for (int i = 0; i < n; i++)
		cout << ans[i] << " ";
}