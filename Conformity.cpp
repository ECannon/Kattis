// #include <bits/stdc++.h>
#include <unordered_map>
#include <algorithm>
#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;

    unordered_map<string, int> map;


    for(int i = 0; i < n; i++) {

        vector<string> v1;
        
        for(int j = 0; j < 5; j++) {
            string temp;
            cin >> temp;
            v1.push_back(temp);
            
        }

        sort(v1.begin(), v1.end());

        string s1;

        for(int j = 0; j < v1.size(); j++) {

            s1 += v1[j] + " ";

        }   

        map[s1]++;
    }
    int m = 0;
    for(auto i : map) {
        m = max(m, i.second);
    }

    int count = 0;
    for(auto i : map) {
        if(i.second == m) {
            count += i.second;
        }
    }

    cout << count;


}