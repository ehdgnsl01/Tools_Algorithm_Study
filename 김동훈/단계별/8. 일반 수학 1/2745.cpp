#include <iostream>
#include <cmath>
using namespace std;

int main(){
    string s;
    int a,res=0;
    cin >> s >> a ;
    for(int i=0;i<s.length();i++){
        if((int)s[i]>=0 && (int)s[i]<=9){
            res += (int)s[i]*pow(a,s.length()-1-i);
        }
        else{
            res += ((int)s[i]-55)*pow(a,s.length()-1-i);
        }
    }
    cout << res;
}