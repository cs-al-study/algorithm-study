#include <iostream>
#include <stack>
using namespace std;

void fast_io() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
}


int main() {
	fast_io();
	
	stack<char> S;
	string input;
	int total = 0;
	cin >> input;
	for (int i = 0; i < input.length(); i++) {
		if (input[i] == '(') {
			S.push(input[i]);
		}
		else if (input[i] == ')' && input[i - 1] == '(') {
			S.pop();
			total += S.size();
		}
		else {
			total++;
			S.pop();
		}
	}
	cout << total << endl;
}