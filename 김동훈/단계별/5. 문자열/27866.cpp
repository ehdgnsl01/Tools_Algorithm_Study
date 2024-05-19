#include <iostream>
using namespace std;

int main(){
    string S;
    int i;
    getline(cin, S);
    cin >> i ;

    cout << S.at(i-1) ;
}