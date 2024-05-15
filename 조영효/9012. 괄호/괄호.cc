#include <bits/stdc++.h>
using namespace std;
int t;
string s;
bool sol() {
    stack<char> stk;
    for (char c : s) {
        if (c == '(') stk.push('(');
        else if (!stk.empty()) stk.pop();
        else return 0;
    }
    return stk.empty();
}
int main() {
    cin >> t;
    while (t--) {
        cin >> s;
        if (sol()) cout << "YES\n";
        else cout << "NO\n";
    } 
}