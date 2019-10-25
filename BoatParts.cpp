#include <bits/stdc++.h>
using namespace std;

int main() {

    int p, n;
    cin >> p >> n;
    set <string> set1; 
    bool all = false;

    for(int i = 0; i < n; i++) {
        string part;
        cin >> part;

        set1.insert(part);

        if(set1.size() == p) {
            cout << i+1;
            all = true;
            break;
        }
    }

    if(!all) cout << "paradox avoided";

}