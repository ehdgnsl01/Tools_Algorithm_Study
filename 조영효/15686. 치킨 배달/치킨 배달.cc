#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pii;
typedef vector<int> vi;
int n, m, arr[54][54], ans = 2e9, tmp, _min, dst;
vector<pii> hs, cs;
void sol(vi v) {
    tmp = 0;
    for (pii h : hs) {
        _min = 2e9;
        for (int c : v) {
            dst = abs(h.first - cs[c].first) + abs(h.second - cs[c].second);
            _min = min(_min, dst);
        }
        tmp += _min;
    }
    ans = min(ans, tmp);
}
void comb(int s, vi v) {
    if (v.size() == m) sol(v);
    else for (int i = s + 1; i < cs.size(); i++) {
        v.push_back(i);
        comb(i, v);
        v.pop_back();
    }
}
int main() {
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
            if (arr[i][j] == 1) hs.push_back({i, j});
            if (arr[i][j] == 2) cs.push_back({i, j});
        }
    vi v;
    comb(-1, v);
    cout << ans;
}