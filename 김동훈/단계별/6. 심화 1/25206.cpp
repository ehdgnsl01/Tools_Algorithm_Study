#include <iostream>
#include <string>
using namespace std;

int main(){
    string str,credit_s,grade;
    double res,credit,sub_num;
    for(int i=0;i<20;i++){
        getline(cin,str);
        credit_s = str.substr(str.find(" ")+1,3);
        grade = str.substr(str.find(" ")+5,str.length());
        credit = stod(credit_s.c_str());
        if (grade == "A+") {
            res += credit * 4.5;
            sub_num += credit;
        } else if (grade == "A0") {
            res += credit * 4.0;
            sub_num += credit;
        } else if (grade == "B+") {
            res += credit * 3.5;
            sub_num += credit;
        } else if (grade == "B0") {
            res += credit * 3.0;
            sub_num += credit;
        } else if (grade == "C+") {
            res += credit * 2.5;
            sub_num += credit;
        } else if (grade == "C0") {
            res += credit * 2.0;
            sub_num += credit;
        } else if (grade == "D+") {
            res += credit * 1.5;
            sub_num += credit;
        } else if (grade == "D0") {
            res += credit * 1.0;
            sub_num += credit;
        } else if (grade == "F") {
            res += credit * 0.0;
            sub_num += credit;
        } 
    }
    cout << res/sub_num ;
}