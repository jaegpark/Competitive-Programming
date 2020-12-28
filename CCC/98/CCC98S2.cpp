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
    for (int i = 1000; i < 10000; i++)
    {
        int divisors=1;
        for (int j = 2; j < sqrt(i); j++)
        {
            if (i % j == 0)
            {
                divisors +=j + i/j;
            }
        }
        if (divisors==i)
        {
            cout << divisors << " ";
        }
    }
    cout << '\n';

    vector<int> two;
    for (int i = 100; i < 1000; i++)
    {
        int o = i % 10;
        int t = (i % 100) / 10;
        int h = i / 100;
        if (pow(o,3) + pow(t,3) + pow(h,3) == i)
        {
            cout << i << " ";
        }
    }

    //ur code goes here
}