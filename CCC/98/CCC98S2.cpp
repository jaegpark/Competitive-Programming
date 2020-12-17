#include <bits/stdc++.h>

using namespace std;

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