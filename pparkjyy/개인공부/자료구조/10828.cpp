#include<iostream>

using namespace std;
int c = 0;
int arr[100001];
void push(int x) {
	arr[c] = x;
	c++;
}

int pop() {
	if (c == 0) return -1;
	c--;
	return arr[c];
}

int size() {
	return c;
}

int empty() {
	if (c == 0)
		return 1;
	else
		return 0;
}

int top() {
	return arr[c-1];
}

int main() {
	int num;
	cin >> num;
	string s;
	int n;
	while (num--) {
		
		cin >> s;
		if (s == "push") {
			cin >> n;
			push(n);
		}
		if (s == "pop") {
			cout << pop()<<endl;
		}
		if (s == "top") {
			cout << top() << endl;
		}
		if (s == "size") {
			cout << size() << endl;
		}
		if (s == "empty") {
			cout << empty() << endl;
		}
	}
	
}