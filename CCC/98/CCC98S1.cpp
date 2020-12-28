#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <sstream>
#include <queue>
#include <deque>
#include <bitset>
#include <iterator>
#include <list>
#include <stack>
#include <map>
#include <set>
#include <functional>
#include <numeric>
#include <utility>
#include <limits>
#include <time.h>
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <cstring>


using namespace std;

using ll = long long;
using ld = long double;
using db = double;
using str = string;

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