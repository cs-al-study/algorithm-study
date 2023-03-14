#include <iostream>
#include <algorithm>

using namespace std;

int arr[21] = { 0, }, n = 0;
bool ch[20 * 100000 + 1] = { false, };

void dfs(int index, int num) {
	if (index > n) {
		cout << index << num << endl;
		return;
	}
	ch[num] = true;
	cout << index << num << endl;
	dfs(index + 1, num);
	dfs(index + 1, num + arr[index]);
	
}

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) cin >> arr[i];
	dfs(0, 0);
	for (int s = 0; s < 20 * 100000 + 1; s++) {
		if (!ch[s]) {
			break;
		}
	}
	return 0;
}