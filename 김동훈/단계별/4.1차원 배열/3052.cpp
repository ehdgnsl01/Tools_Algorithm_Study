#include <iostream>
using namespace std;

int main(){
    int a[10];
    int result[42] = {};
    int count=0;

    for (int i=0;i<10;i++){
        cin >> a[i];
        a[i] = a[i]%42;
        for (int j=1;j<=42;j++){
            if(a[i]==j) result[j-1]++;
        }
    }
    for(int i=0;i<42;i++){
        if(result[i]!=0) count++;
    }
    cout << count ;
}