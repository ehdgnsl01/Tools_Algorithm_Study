#include <iostream>
using namespace std;

int main() {
 
	int n;
	int x;
	cin >> n >> x;
 
	int arr[n];
 
	for(int i = 0; i < n; i++) {
		cin >> arr[i];
	}
 
	for(int i = 0; i < n; i++) {
		if(arr[i] < x) {
			cout << arr[i] << " ";
		}
	}
	return 0;
}

