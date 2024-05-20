#include <iostream>
#include <string>
using namespace std;

int main(){
    int n;
    cin >> n;
    int res = n;

    string str;
    for(int i=0;i<n;i++){
        cin >> str;
        for(int j=0;j<str.length()-1;j++){
            if(str.find(str[j],j+1) != string::npos && str[j] != str[j+1]){
                res--;
                break;
            }
        }
    }

    cout << res;
}