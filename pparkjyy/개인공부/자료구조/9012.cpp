#include<iostream>
#include<string>
using namespace std;

int main() {
	int num;
	string str;
	cin >> num;
	cin.ignore();
	int c;
	while (num--) {
		getline(cin, str);
		c = 0;
		for (int i = 0; i < str.size(); i++) {
			if (str[i] == ')' && c == 0) {
				c--;
				break;
			}
			if (str[i] == '(') c++;
			else if (str[i] == ')') c--;
		}
		if (c == 0) cout << "YES" << endl;
		else cout << "NO" << endl;
	}
}