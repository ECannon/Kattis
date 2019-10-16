#include <bits/stdc++.h>

using namespace std;

int main() {
        int n;
        cin >> n;

        vector<int> vect;

        int days;

        while(cin >> days) {

            vect.push_back(days);
        }
        int temp = INT_MAX;
        int index = 0;
        for(int i = 0; i < vect.size()-2; i++){

            int m = max(vect[i], vect[i+2]);
            if(m < temp) {
                temp = m;
                index = i+1;
            }

        }

        cout << endl << index << " " << temp;
}