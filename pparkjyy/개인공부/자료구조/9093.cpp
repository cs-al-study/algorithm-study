#include<iostream>
#include<stack>
#include<string>


using namespace std;


int main() {
	int num;
	string str;
	stack<char> st;
	cin >> num;
	cin.ignore();
	while (num--) {
		getline(cin, str);
		str += ' ';
		for (int i = 0; i < str.size(); i++) {
			if (str[i] == ' ') {
				while (!st.empty()) {
					cout << st.top();
					st.pop();
				}cout << ' ';
			}
			else
				st.push(str[i]);
		}
		cout << endl;
	}
}