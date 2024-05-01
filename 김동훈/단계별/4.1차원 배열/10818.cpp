#include <iostream>
using namespace std;

int main() {
 
	int n;
	cin >> n;
    int min=1000001,max=-1000001;
 
	int a;

	for(int i = 0; i < n; i++) {
		cin >> a;
        if(a<min)
            min = a;
        else if(a>max)
            max = a;
	}
    cout << min <<" "<< max;
}

