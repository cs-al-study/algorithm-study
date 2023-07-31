#include <iostream>
#include <list> 
using namespace std;


string str;
int num;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    list<char> l;
    
    cin >> str;
    for (char c : str) l.push_back(c);
    list<char>::iterator t = l.end();

    cin >> num;
    while (num--) {
        string cmd;
        cin >> cmd;
        if (cmd == "L") {
            if(t != l.begin()) t--;
        }
        else if (cmd == "D") {
            if (t != l.end()) t++;
        }
        else if (cmd == "B") {
            list<char>::iterator temp = t;
            if (t != l.begin()) {
                
                l.erase(--t);
            }
            t = temp;
        }
        else {
            char c;
            cin >> c;
            l.insert(t, c);
        }
    }
    for (auto it : l)cout << it;

}