#include <bits/stdc++.h>
using namespace std;
int n, arr[68][68];
string s;
void sol(int x1, int y1, int x2, int y2, int size) {
    if (size == 0) return;
    int a = arr[y1][x1];
    for (int i = y1; i < y2; i++)
        for (int j = x1; j < x2; j++)
            if (arr[i][j] != a) {
                cout << "(";
                sol(x1, y1, (x1+x2)/2, (y1+y2)/2, size/2);
                sol((x1+x2)/2, y1, x2, (y1+y2)/2, size/2);
                sol(x1, (y1+y2)/2, (x1+x2)/2, y2, size/2);
                sol((x1+x2)/2, (y1+y2)/2, x2, y2, size/2);
                cout << ")";
                return;
            }
    cout << a;
}
int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        for (int j = 0; j < n; j++)
            arr[i][j] = (int)(s[j] - '0');
    }
    sol(0, 0, n, n, n);
}