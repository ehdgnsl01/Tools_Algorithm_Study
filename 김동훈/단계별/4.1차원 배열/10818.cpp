#include <iostream>
using namespace std;

int main() {
 
	int n;
	cin >> n;
    int min=1000000,max=-1000000;
 
	int a;

	for(int i = 0; i < n; i++) {
		cin >> a;
        if(a<min)
            min = a;
        if(a>max)
            max = a;
	}
    cout << min <<" "<< max;
}

