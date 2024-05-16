#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main(){
    string s1,s2;
    cin >> s1 >> s2 ;
    reverse(s1.begin(), s1.end());
    reverse(s2.begin(), s2.end());
    int num1 = stoi(s1);
    int num2 = stoi(s2);
    cout << ((num1 > num2) ? num1 : num2) ;
} 