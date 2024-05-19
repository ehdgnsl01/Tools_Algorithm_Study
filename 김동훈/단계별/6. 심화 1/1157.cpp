#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    string str;
    getline(cin,str);
    int res[27] = {0,} ;
    string alphabet = "abcdefghijklmnopqrstuvwxyz" ;
    string Balphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    for (int i=0;i<str.length();i++){
        for(int j=0;j<27;j++){
            if(str[i] == alphabet[j] || str[i] == Balphabet[j]){
                res[j]++;
            }
        }
    }
    int max_index = 0;
    int a = 0;
    for(int i=1;i<27;i++){
        if(res[max_index] < res[i]) max_index = i;
    }
    for(int i=0;i<27;i++){
        if(max_index != i)
            if(res[max_index] == res[i]) max_index = -1;
    }
    if(max_index == -1) cout << "?";
    else cout << Balphabet[max_index] ;
}