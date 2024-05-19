#include <iostream>
using namespace std;

int main(){
    string str;
    cin >> str;
    int res = 0;
    int num = str.length()/2;
    for(int i=0;i<num;i++){
        if(str[i]==str[str.length()-i-1]) res++;
    }
    if(num==res) cout << "1";
    else cout << "0" ;
}