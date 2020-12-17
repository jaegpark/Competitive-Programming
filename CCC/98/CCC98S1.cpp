#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n; //input n
    string fucker;
    getline(cin, fucker);
    int j = 0;

    for (int i = 0; i < n; i++)
    {
        string input;
        getline(cin, input);
        vector<string> words;
        int prev_space = -1;
        j=0;
        while (j < input.length())
        {
            if (input[j] == ' ')
            {
                if (j - prev_space - 1 == 4)
                {
                    words.push_back("****");
                }
                else
                {
                    words.push_back(input.substr(prev_space + 1, j - prev_space - 1));
                }
                prev_space = j;
            }
            else if (j == input.length() - 1)
            {
                if (j - prev_space == 4)
                {
                    words.push_back("****");
                }
                else
                {
                    words.push_back(input.substr(prev_space + 1, j - prev_space));
                }
            }
            j += 1;
        }
        for (string s : words)
        {
            cout << s << " ";
        }
        cout << '\n';
    }
    //ur code goes here
}