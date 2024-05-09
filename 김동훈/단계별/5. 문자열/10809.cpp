#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    string alphabet = "abcdefghijklmnopqrstuvwxyz";
    cin >> s;
    for(int i=0;i<alphabet.length();i++)
        cout << (int)s.find(alphabet[i]) << " ";
    return 0;
}
/*
다른 STL 없이 푼 코드
int main(){
    string S;
    cin >> S;
    int result[26];fill_n(result,26,-1);
    for(int i=0;i<S.size();i++){
        for(int j=0;j<26;j++){
            if((int)S[i] == 97+j && result[j]==-1){
                result[j] = i;
                break;
            }
        }
    }
    for(int i=0;i<26;i++){
        cout << result[i] << " ";
    }
}
*/