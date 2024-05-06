#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int main() {
    string grades[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P" };
    double scores[] = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

    double sum = 0.0;
    int totalCredits = 0;

    string input;
    for (int i = 0; i < 20; i++) {
        getline(cin, input);
        if (input.back() == 'P') continue;

        int credit_idx = input.find(".");
        credit_idx--;
        int credit = input[credit_idx] - '0';

        int grade_idx = credit_idx + 4;
        string grade = input.substr(grade_idx, 3);
        cout << grade;

        for (int j = 0; j < 9; j++) {
            if (grades[j] == grade) {
                sum += credit * scores[j];
                break;
            }
        }

        
        totalCredits += credit;
    }

    cout << fixed << setprecision(6);
    if (totalCredits > 0) {
        cout << sum / totalCredits << endl;
    }
    else {
        cout << "0.000000" << endl;
    }

    return 0;
}
