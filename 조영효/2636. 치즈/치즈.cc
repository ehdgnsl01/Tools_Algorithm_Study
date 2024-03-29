#include <bits/stdc++.h>
using namespace std;
int n, m, arr[104][104], vst[104][104], dx[4] = {-1, 0, 1, 0}, dy[4] = {0, 1, 0, -1}, x, y, xx, yy, cnt, ans, ret;
queue<pair<int, int>> q;
int chk() {
	ret = 0;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			if (arr[i][j]) ret = 1;
	return ret;
}
int main() {
	cin >> n >> m;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			cin >> arr[i][j];
	while (chk()) {
		ans = 0;
		vst[0][0] = 1;
		q.push({0, 0});
		while (q.size()) {
			tie(y, x) = q.front(); q.pop();
			for (int i = 0; i < 4; i ++) {
				xx = x + dx[i];
				yy = y + dy[i];
				if (xx < 0 || yy < 0 || xx >= m || yy >= n || vst[yy][xx]) continue;
				if (arr[yy][xx] == 1) {
					arr[yy][xx] = -1;
					ans++;
				}
				else if (arr[yy][xx] == 0){
					vst[yy][xx] = 1;
					q.push({yy, xx});
				}
			}
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == -1) arr[i][j] = 0;
			}
		memset(vst, 0, sizeof(vst));
		cnt++;
	}
	cout << cnt << "\n" << ans;
}