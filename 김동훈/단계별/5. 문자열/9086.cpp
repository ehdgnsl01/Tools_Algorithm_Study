#include <iostream>
using namespace std;

int main(){
    int t;
    string str;
    cin >> t ;
    for(int i=0;i<t;i++){
        getline(cin,str);
        cout << str.front() << str.back() ; 
        str.clear();
    }
}