#include <iostream>
#include <queue> 
using namespace std;


int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	queue<int> q;
	int num;
	cin >> num;
	while (num--) {
		string s;
		cin >> s;
		if (s == "push") {
			int c;
			cin >> c;
			q.push(c);
		}
		if (s == "front") {
			if (q.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << q.front() << "\n";
		}
		if (s == "back") {
			if (q.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << q.back() << "\n";
		}
		if (s == "size") cout << q.size() << "\n";
		if (s == "empty") cout << q.empty() << "\n";
		if (s == "pop") {
			if (q.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << q.front() << "\n";
			q.pop();
		}
	}
}