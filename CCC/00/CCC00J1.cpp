#include <iostream>
#include <sstream>
#include <iomanip>
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

#define pb push_back
#define pf push_front
#define mp make_pair

int s, t;
int dates[6][7];
// whitespaces are incorrect for some reason but practically 
// speaking i think its still ok
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cin >> s >> t;

    int x = 1;

    cout << "Sun Mon Tue Wed Thr Fri Sat" << endl;

    for (int i = 0; i < 6; ++i)
    {
        if (i == 0)
        {
            for (int j = 0; j < s - 1; j++)
            {
                if (j==6){
                    cout << std::right << std::setw(3) << endl;
                }else{
                    cout << std::right << std::setw(3) << "" << " ";
                }
            }
            for (int j = s - 1; j < 7; ++j)
            {
                if (x == t+1)
                    break;
                if (j==6){
                    cout << std::right << std::setw(3) << x << endl;
                }else{
                    cout << std::right << std::setw(3) << x << " ";
                }
                x++;
            }
        }
        else
        {
            for (int j = 0; j < 7; ++j)
            {
                if (x == t+1)
                    break;
                if (j==6){
                    cout << std::right << std::setw(3) << x << endl;
                }else{
                    cout << std::right << std::setw(3) << x << " ";
                }
                x++;
            }
        }
    }
}