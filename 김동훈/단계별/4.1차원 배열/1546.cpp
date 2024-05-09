#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
    double arr[n];
    double sum=0;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    sort(arr,arr+n);
    for(int i=0;i<n;i++){
        arr[i]= arr[i]/arr[n-1]*100;
        sum += arr[i];
    }
    cout << sum/n ;
}