#include <iostream>
using namespace std;

int main(){
    int a, x, y;
    int max=-1;
    for(int i=1;i<=9;i++){
        for(int j=1;j<=9;j++){
            cin >> a;
            if(max < a){
                max = a;
                x=i;y=j;
            }
        }
    }
    cout << max << endl << x << " " << y ;
}