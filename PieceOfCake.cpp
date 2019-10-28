#include <bits/stdc++.h>
using namespace std;

int main() {
    int a,b,c;
    cin >> a >> b >> c;

    int w, h;

    w = max(b, a-b);
    h = max(c, a-c);

    cout << w*h*4;
}