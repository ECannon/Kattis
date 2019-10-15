#include <bits/stdc++.h>
using namespace std;

int main()
{

    string s;
    vector<int> ind;
    int count = 1;

    while (cin >> s)
    {

        if (s.find("FBI") != string::npos)
        {
            ind.push_back(count);
        }
        count++;
    }
    if (ind.size() > 0)
    {
        for (int i : ind)
        {
            cout << i << " ";
        }
    } else cout << "HE GOT AWAY!";
}