#include <iostream>
using namespace std;

char arr[51][51];
char white_arr[8][8] = {
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W'
};

char black_arr[8][8] = {
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B',
	'B','W','B','W','B','W','B','W',
	'W','B','W','B','W','B','W','B'
};

int wf(int x, int y) {
	int result = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (arr[x + i][y + j] != white_arr[i][j])
				result++;
		}
	}
	return result;
}

int bf(int x, int y) {
	int result = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (arr[x + i][y + j] != black_arr[i][j])
				result++;
		}
	}
	return result;
}

int main() {
	int n, m, result = 64;
	cin >> n >> m;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			cin >> arr[i][j];

	int t_white, t_black;
	for (int i = 0; i <= n - 8; i++) {
		for (int j = 0; j <= m - 8; j++) {
			t_white = wf(i, j);
			t_black = bf(i, j);
			if (t_white < t_black) {
				result = (t_white < result) ? t_white : result;
			}
			else {
				result = (t_black < result) ? t_black : result;
			}
		}
	}
	cout << result << '\n';
}