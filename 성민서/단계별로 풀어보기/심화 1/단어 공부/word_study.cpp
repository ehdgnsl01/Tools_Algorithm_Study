#include <iostream>
using namespace std;

int main() {
    int arr[26] = { 0 };
    string str;
    cin >> str;
    if (str.size() > 1000000) {
        cout << "문자열의 길이는 1,000,000을 넘을 수 없습니다.";
        return 0;
    }

    for (int i = 0; i < str.size(); i++) {
        if (str[i] >= 65 && str[i] <= 90) {
            str[i] += 32;
        }
        if (str[i] >= 97 && str[i] <= 122) {
            arr[str[i] - 'a']++;
        }
    }

    int max = arr[0];
    int max_idx = 0;
    for (int i = 1; i < sizeof(arr) / sizeof(int); i++) {
        if (arr[i] > max) {
            max = arr[i];
            max_idx = i;
        }
    }

    for (int i = 0; i < sizeof(arr) / sizeof(int); i++) {
        if (arr[i] == max && i != max_idx) {
            cout << "?";
            return 0;
        }
    }

    cout << char(max_idx + 65);

    return 0;
}