#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pii;
int n, c, tmp;
map<int, int> mp, mp_f;
vector<pii> v;
bool cmp(pii a, pii b) {
	if (a.first == b.first)
		return mp_f[a.second] > mp_f[b.second];
	return a.first > b.first;
}
int main() {
	cin >> n >> c;
	while (n--) {
		cin >> tmp;
		mp[tmp]++;
		if (!mp_f[tmp]) mp_f[tmp] = n;
	}
	for (auto m : mp)
		v.push_back({m.second, m.first});
	sort(v.begin(), v.end(), cmp);
	for (auto i : v)
		for (int j = 0 ; j < i.first; j++)
			cout << i.second << " ";
}