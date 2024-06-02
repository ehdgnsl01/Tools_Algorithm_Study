#include <iostream>
#include <algorithm>
using namespace std;

int back_arr[101][101] = {0, };

int main(){
    int paper_num,x_num,y_num,res = 0;
    cin >> paper_num;
    while(paper_num--){
        cin >> x_num >> y_num ;
        for(int i=x_num;i<x_num+10;i++){
            for(int j=y_num;j<y_num+10;j++){
                if(back_arr[i][j] == 0){
                    back_arr[i][j] = 1;
                }
            }
        }
    }
    for(int i=0;i<100;i++){
        for(int j=0;j<100;j++){
            if(back_arr[i][j] == 1){
                res++;
            }
        }
    }
    cout << res ;
}