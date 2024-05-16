#include <iostream>
#include <sstream>
using namespace std;

int main(){
    string str;
    getline(cin,str);
    stringstream ss(str);
    string str2;
    int count = 0;
    while (ss>>str2) count +=1;
    cout << count;
}