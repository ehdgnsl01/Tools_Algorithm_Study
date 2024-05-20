#include <iostream>
#include <string>
using namespace std;

string str;
int res = 0;

void findcroatia(string s){
    size_t pos = str.find(s);
    while(pos != string::npos){
        res--;
        pos = str.find(s,pos + 1);
    }
}
int main(){
    cin >> str;
    res = str.length();

    findcroatia("c=");
    findcroatia("c-");
    findcroatia("dz=");
    findcroatia("d-");
    findcroatia("lj");
    findcroatia("nj");
    findcroatia("s=");
    findcroatia("z=");

    cout << res ;

}