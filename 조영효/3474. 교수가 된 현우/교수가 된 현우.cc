#include <bits/stdc++.h>
using namespace std;
int t, n, ans;
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	cin >> t;
	while (t--) {
		cin >> n;
		ans = 0;
		for (int i = 5; i <= n; i *= 5)
			ans += n / i;
		cout << ans << "\n";
	}
}