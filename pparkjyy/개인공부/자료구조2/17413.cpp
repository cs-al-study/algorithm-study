#include <iostream>
#include <stack>
#include <string>
#include <queue>
using namespace std;


int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	stack<char> st;
	queue<char> q;
	string str;
	int num = 0;
	getline(cin, str);
	for (int i = 0; i < str.size()+1; i++) {
		
		if (str[i] == '<') {
			num++;
			if (!st.empty()) {
				while (!st.empty()) {

					cout << st.top();
					st.pop();
				}
			}
		}
		
		if (str[i] == '>') {
			while (!q.empty()) {
				cout << q.front();
				q.pop();
			}
			cout << '>';
			num--;
		}
		if (str[i] == ' ' || i == str.size()) {
			if (num == 1) {
				q.push(' ');
				continue;
			}
			if (str[i] == '>'||st.empty() == 1) continue;
			
			while (!st.empty()) {
				
				cout << st.top();
				st.pop();
			}
			cout << ' ';
		}
		if (num == 1) {
			q.push(str[i]);
		}
		else if (num == 0) {
			if (str[i] == ' '||str[i] == '<' || str[i] == '>') continue;
			st.push(str[i]);
		}
			
		
	}

}