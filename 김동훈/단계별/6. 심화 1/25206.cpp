#include <iostream>
#include <string>
using namespace std;

int main(){
    string str,credit_s,grade;
    double res,credit;
    for(int i=0;i<20;i++){
        getline(cin,str);
        credit_s = str.substr(str.find(" ")+1,3);
        grade = str.substr(str.find(" ")+5,str.length());
        credit = stod(credit_s.c_str());
        switch (){

        }
    }
}