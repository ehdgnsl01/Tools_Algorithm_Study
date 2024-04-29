#include <bits/stdc++.h>
using namespace std;
int n, m, arr[10][10], vst[10][10], dx[4] = {-1, 0, 1, 0}, dy[4] = {0, 1, 0, -1}, xx, yy, ans;
vector<pair<int, int>> emp, vrs;
void dfs(int y, int x) {
    vst[y][x] = 1;
    for (int i = 0; i < 4; i++) {
        xx = x + dx[i];
        yy = y + dy[i];
        if (xx < 0 || yy < 0 || xx >= m || yy >= n || vst[yy][xx] || arr[yy][xx]) continue ;
        dfs(yy, xx);
    }
}
int sol() {
    memset(vst, 0, sizeof(vst));
    for (pair<int, int> vr : vrs)
        dfs(vr.first, vr.second);
    int cnt = 0;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (!vst[i][j] && !arr[i][j]) cnt++;
    return cnt;
}
int main() {
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
            if (!arr[i][j]) emp.push_back({i, j});
            if (arr[i][j] == 2) vrs.push_back({i, j});
        }
    for (int w1 = 0; w1 < emp.size(); w1++)
        for (int w2 = 0; w2 < w1; w2++)
            for (int w3 = 0; w3 < w2; w3++) {
                arr[emp[w1].first][emp[w1].second] =
                arr[emp[w2].first][emp[w2].second] =
                arr[emp[w3].first][emp[w3].second] = 1;
                ans = max(ans, sol());
                arr[emp[w1].first][emp[w1].second] =
                arr[emp[w2].first][emp[w2].second] =
                arr[emp[w3].first][emp[w3].second] = 0;
            }
    cout << ans;
}