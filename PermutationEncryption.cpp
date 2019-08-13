
#include <iostream>
#include <string>
using namespace std;

int main() {

	while (true) {

		int keyLength;
		cin >> keyLength;
		if (keyLength == 0) {
			break;
		}

		int key[keyLength];

		for (int i = 0; i < keyLength; i++) {
			cin >> key[i];
		}

		string s1;
		cin.ignore();
		getline(cin, s1);

		if (s1.length() % keyLength != 0) {
			int n1 = s1.length() % keyLength;
			int subt = keyLength - n1;
			for (int i = 0; i < subt; i++) {
				s1 += " ";
			}
		}

		string s2 = "";

		while (s1.length() > 0) {

			for (int i = 0; i < keyLength; i++) {
				s2 += s1[key[i] - 1];
			}
			s1 = s1.substr(keyLength, s1.length() - 1);

		}
		cout << "'" << s2 << "'" << endl;

	}

	return 0;
}
