#include <iostream>
#include <string>
using namespace std;

string word;
int counter = 0;

void findCroatian(string str) {
    size_t pos = word.find(str);
    while (pos != string::npos) {
        counter--;
        pos = word.find(str, pos + 1);
    }
}

int main() {
    cin >> word;
    counter = word.length();

    findCroatian("c=");
    findCroatian("c-");
    findCroatian("dz=");
    findCroatian("d-");
    findCroatian("lj");
    findCroatian("nj");
    findCroatian("s=");
    findCroatian("z=");

    cout << counter << endl;

    return 0;
}
