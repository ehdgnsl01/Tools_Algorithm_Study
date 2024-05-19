#include <bits/stdc++.h>
using namespace std;
int n, t, m, sec, s, s1, s2, tot1, tot2;
char c;
int main() {
	cin >> n;
	while (n--) {
		cin >> t >> m >> c >> sec;
		if (s1 > s2) tot1 += m * 60 + sec - s;
		if (s1 < s2) tot2 += m * 60 + sec - s;
		if (t == 1) s1++;
		else s2++;
		s = m * 60 + sec;
	}
	if (s1 > s2) tot1 += 48 * 60 - s;
	if (s1 < s2) tot2 += 48 * 60 - s;
	printf("%02d:%02d\n%02d:%02d", tot1 / 60, tot1 % 60, tot2 / 60, tot2 % 60);
}