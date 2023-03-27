#include<iostream>
#include<algorithm>
#include<queue>
#include<tuple>
#include<string>
using namespace std;

int N, M, x, cnt, ans;
int R_x, R_y, B_x, B_y;
int map[11][11]; // 0:길, 1:벽, 2:구멍
bool visit[11][11][11][11]; // R(x,y), B(x,y) 방문여부
bool flag;
int dx[4] = { -1,1,0,0 };
int dy[4] = { 0,0,-1,1 };
queue<tuple<int, int, int, int, int>> q;
string s;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	cin >> N >> M;

	for (int i = 1; i <= N; i++)
	{
		cin >> s;
		for (int j = 1; j <= M; j++)
		{
			if (s[j-1] == '#') map[i][j] = 1;
			else if (s[j-1] == 'O') map[i][j] = 2;
			else map[i][j] = 0;
			
			if (s[j-1] == 'B')
			{
				B_x = i;
				B_y = j;
			}
			else if (s[j-1] == 'R')
			{
				R_x = i;
				R_y = j;
			}
		}
	}

	q.push({ R_x,R_y,B_x,B_y,0 });

	while (!q.empty())
	{
		int now_Rx = get<0>(q.front());
		int now_Ry = get<1>(q.front());
		int now_Bx = get<2>(q.front());
		int now_By = get<3>(q.front());
		int cnt = get<4>(q.front());
		q.pop();

		visit[now_Rx][now_Ry][now_Bx][now_By] = true;

		// 10회 이상일 경우
		if (cnt > 10) break;

		// 빨간구슬이 구멍에 빠진 경우
		if (map[now_Rx][now_Ry] == 2)
		{
			flag = true;
			ans = cnt;
			break;
		}

		for (int i = 0; i < 4; i++) // 상,하,좌,우 순
		{
			int next_Rx = now_Rx;
			int next_Ry = now_Ry;
			int next_Bx = now_Bx;
			int next_By = now_By;

			while (1) // R 이동
			{
				if (map[next_Rx + dx[i]][next_Ry + dy[i]] == 0) // 길
				{
					next_Rx += dx[i];
					next_Ry += dy[i];
				}
				else if (map[next_Rx + dx[i]][next_Ry + dy[i]] == 2) // 구멍
				{
					next_Rx += dx[i];
					next_Ry += dy[i];
					break;
				}
				else break; // 벽
			}

			while (1) // B 이동
			{
				if (map[next_Bx + dx[i]][next_By + dy[i]] == 0) // 길
				{
					next_Bx += dx[i];
					next_By += dy[i];
				}
				else if (map[next_Bx + dx[i]][next_By + dy[i]] == 2) // 구멍
				{
					next_Bx += dx[i];
					next_By += dy[i];
					break;
				}
				else break; // 벽
			}

			// 파란구슬이 구멍에 빠졌을 경우
			if (map[next_Bx][next_By] == 2) continue;

			// 구슬이 겹쳐진 경우
			if (next_Rx == next_Bx && next_Ry == next_By)
			{
				switch (i) // 0:상, 1:하, 2:좌, 3:우
				{
				case 0: now_Rx > now_Bx ? next_Rx++ : next_Bx++; break;
				case 1: now_Rx < now_Bx ? next_Rx-- : next_Bx--; break;
				case 2: now_Ry > now_By ? next_Ry++ : next_By++; break;
				case 3: now_Ry < now_By ? next_Ry-- : next_By--; break;
				}
			}

			// 방문한적이 없다면
			if (!visit[next_Rx][next_Ry][next_Bx][next_By])
				q.push({ next_Rx ,next_Ry ,next_Bx ,next_By ,cnt + 1 });

		}
	}

	if (flag) cout << ans;
	else cout << -1;
	
}