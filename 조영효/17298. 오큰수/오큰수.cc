#include <bits/stdc++.h>
using namespace std;
int n, arr[1000004], ans[1000004];
stack<int> s;
int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        while (s.size() && arr[s.top()] < arr[i]) {
            ans[s.top()] = arr[i];
            s.pop();
        }
        s.push(i);
    }
    for (int i = 0; i < n; i++)
        cout << (ans[i] ? ans[i] : -1) << " ";
}