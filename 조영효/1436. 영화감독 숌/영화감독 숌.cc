#include <bits/stdc++.h>
using namespace std;
int n, i = 666;
int main() {
    cin >> n;
    while (n > 1)
        if (to_string(++i).find("666") != string::npos)
			n--;
    cout << i; 
}