#include <iostream>
using namespace std;

int main(){
    string s,p;
    int t,r;
    cin >> t;
    while(t--){
        cin >> r >> s;
        for(int i=0;i<s.length();i++)
            p.append(r,s[i]);
        cout << p << endl;
        p.clear();
    }
}