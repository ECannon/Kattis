#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int largest = 0;
    vector<int> student;
    vector<int> actual;

    for(int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        student.push_back(inp);
        largest = max(inp, largest);
    }

    bool perfect = true;
    for(int i = 1; i <= largest; i++) {
        if(!(find(student.begin(), student.end(), i) != student.end())) {
            cout << i << endl;
            perfect = false;
        }
    }

    if(perfect) cout << "good job" << endl;

}