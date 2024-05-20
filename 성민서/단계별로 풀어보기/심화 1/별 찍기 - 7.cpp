#include <iostream>
using namespace std;

int main() {
    int N;
    int space;
    int star = 1;
    bool updown = true;
    cin >> N;
    space = N - 1;
    if (N < 1 || N>100) {
        cout << "'1 <= N <= 100'ÀÇ °æ°è¸¦ ¹þ¾î³³´Ï´Ù.";
        return 0;
    }
    for (int y = 0; y < 2 * N - 1; y++) {
        for (int x = 0; x < space; x++) {
            cout << " ";
        }
        for (int x = 0; x < star; x++) {
            cout << "*";
        }
        if (star == 2 * N - 1)updown = false;
        if (updown) {
            star += 2;
            space--;
        }
        else {
            star -= 2;
            space++;
        }
        cout << endl;
    }

    return 0;
}