#include <iostream>
using namespace std;

int main(){
    int n ;
    string str;
    int sum = 0;

    cin >> n >> str ;
    for(int i=0;i<n;i++){
        sum += (int)str[i] - 48; // 아스키코드 숫자로 갈려면 -48
    }

    cout << sum ;
}