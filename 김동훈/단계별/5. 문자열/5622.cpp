#include <iostream>
using namespace std;

int main(){
    string str ;
    cin >> str ;
    int time = 0 ;
    for (int i=0; i< str.length(); i++){
        if(str[i]<='C') time += 3;
        else if(str[i]<='F') time += 4;
        else if(str[i]<='I') time += 5;
        else if(str[i]<='L') time += 6;
        else if(str[i]<='O') time += 7;
        else if(str[i]<='S') time += 8;
        else if(str[i]<='V') time += 9;
        else if(str[i]<='Z') time += 10;
    }
    cout << time ;
}