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

#define pb push_back
#define pf push_front
#define mp make_pair

/*
This is an INCOMPLETE SOLUTION. This was given 3/10 on the test cases. 
*/

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    vector<char> dir;
    vector<int> count;
    vector<pair<ll, ll>> coords;
    vector<bool> stopped;
    vector<int> indicies;
    cin >> n;
    for (int x, y, i = 0; i < n; i++)
    {
        char d;
        cin >> d >> x >> y;
        dir.pb(d);
        coords.pb(mp(x, y));
        count.pb(2147483647);
        stopped.pb(false);
        indicies.pb(i);
    }

    //sort based on y
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (coords[j].second > coords[j + 1].second)
            {
                char t = dir[j];
                dir[j] = dir[j + 1];
                dir[j + 1] = t;

                int temp = coords[j].first;
                coords[j].first = coords[j + 1].first;
                coords[j + 1].first = temp;

                int temp1 = coords[j].second;
                coords[j].second = coords[j + 1].second;
                coords[j + 1].second = temp1;

                int temp2 = indicies[j];
                indicies[j] = indicies[j + 1];
                indicies[j + 1] = temp2;

                int temp3 = count[j];
                count[j] = count[j + 1];
                count[j + 1] = temp3;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (dir[i] == 'N')
            {
                if (dir[j] == 'E')
                {
                    int xdiff = coords[i].first - coords[j].first, ydiff = coords[j].second - coords[i].second;
                    // towards each other: x difference > y difference, east guy's thing is limited
                    if (xdiff > 0 && ydiff > 0 && xdiff > ydiff && xdiff < count[j])
                    {
                        if (stopped[j] || !stopped[i])
                        {
                            if (count[j] > xdiff)
                            {
                                count[j] = xdiff;
                                stopped[j] = true;
                            }
                        }
                    }
                    // towards each other: x difference < y difference, north guy's thing is limited
                    else if (xdiff > 0 && ydiff > 0 && xdiff < ydiff && ydiff < count[i])
                    {
                        if (stopped[i] || !stopped[j])
                        {
                            if (count[i] > ydiff)
                            {
                                count[i] = ydiff;
                                stopped[i] = true;
                            }
                        }
                    }
                }
            }
            else if (dir[i] == 'E')
            {
                if (dir[j] == 'N')
                {
                    int xdiff = coords[j].first - coords[i].first, ydiff = coords[i].second - coords[j].second;
                    // towards each other: x difference > y difference, east guy's thing is limited
                    if (xdiff > 0 && ydiff > 0 && xdiff > ydiff && xdiff < count[i])
                    {
                        if (stopped[i] || !stopped[j])
                        {
                            if (count[i] > xdiff)
                            {
                                count[i] = xdiff;
                                stopped[i] = true;
                            }
                        }
                    }
                    else if (xdiff > 0 && ydiff > 0 && xdiff < ydiff && ydiff < count[j])
                    {
                        if (stopped[j] || !stopped[i])
                        {
                            if (count[j] > ydiff)
                            {
                                count[j] = ydiff;
                                stopped[j] = true;
                            }
                        }
                    }
                }
            }
        }
    }
    //sort based on x
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (coords[j].first > coords[j + 1].first)
            {
                char t = dir[j];
                dir[j] = dir[j+1];
                dir[j+1]=t;

                int temp = coords[j].first;
                coords[j].first = coords[j + 1].first;
                coords[j+1].first = temp;

                int temp1 = coords[j].second;
                coords[j].second = coords[j + 1].second;
                coords[j + 1].second = temp1;

                int temp2 = indicies[j];
                indicies[j] = indicies[j + 1];
                indicies[j + 1] = temp2;

                int temp3 = count[j];
                count[j] = count[j + 1];
                count[j + 1] = temp3;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (dir[i] == 'N')
            {
                if (dir[j] == 'E')
                {
                    int xdiff = coords[i].first - coords[j].first, ydiff = coords[j].second - coords[i].second;
                    // towards each other: x difference > y difference, east guy's thing is limited
                    if (xdiff > 0 && ydiff > 0 && xdiff > ydiff && xdiff < count[j])
                    {
                        if (stopped[j] || !stopped[i])
                        {
                            if (count[j] > xdiff)
                            {
                                count[j] = xdiff;
                                stopped[j] = true;
                            }
                        }
                    }
                    // towards each other: x difference < y difference, north guy's thing is limited
                    else if (xdiff > 0 && ydiff > 0 && xdiff < ydiff && ydiff < count[i])
                    {
                        if (stopped[i] || !stopped[j])
                        {
                            if (count[i] > ydiff)
                            {
                                count[i] = ydiff;
                                stopped[i] = true;
                            }
                        }
                    }
                }
            }
            else if (dir[i] == 'E')
            {
                if (dir[j] == 'N')
                {
                    int xdiff = coords[j].first - coords[i].first, ydiff = coords[i].second - coords[j].second;
                    // towards each other: x difference > y difference, east guy's thing is limited
                    if (xdiff > 0 && ydiff > 0 && xdiff > ydiff && xdiff < count[i])
                    {
                        if (stopped[i] || !stopped[j])
                        {
                            if (count[i] > xdiff)
                            {
                                count[i] = xdiff;
                                stopped[i] = true;
                            }
                        }
                    }
                    else if (xdiff > 0 && ydiff > 0 && xdiff < ydiff && ydiff < count[j])
                    {
                        if (stopped[j] || !stopped[i])
                        {
                            if (count[j] > ydiff)
                            {
                                count[j] = ydiff;
                                stopped[j] = true;
                            }
                        }
                    }
                }
            }
        }
    }

    for (int a : count)
    {
        if (a == 2147483647)
        {
            cout << "Infinity"
                 << "\n";
        }
        else
        {
            cout << a << "\n";
        }
    }
}