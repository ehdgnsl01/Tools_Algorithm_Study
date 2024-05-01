#include <iostream>
using namespace std;

int main() {
 
	int n[31] = {0,};
    int a;
	for(int i = 0; i < 28; i++) {
        cin >> a;
        n[a] = 1;
	}
    
    for(int i=1; i<=30; i++){
        if(!n[i]) 
            cout << i << endl;
    }
}

