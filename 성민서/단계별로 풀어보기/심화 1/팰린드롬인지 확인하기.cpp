#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    string rev_str;

    for (int i = 0; i < str.length(); i++) {
        rev_str += str[str.length() - i - 1];
    }

    if (str == rev_str) {
        cout << 1;
    }
    else {
        cout << 0;
    }

    return 0;
}
