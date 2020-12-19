#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using ld = long double;
using db = double;
using str = string;

#define pb push_back
#define pf push_front

vector<int> in;
vector<pair<int, int>> pairs;
int n;


/*
This was given 10/10 on the test cases. 
*/

bool calc(pair<int, int> range)
{
    int sum = 0;
    for (int i = range.first; i <= range.second; i++)
    {
        sum += in[i];
    }
    for (int i = range.first; i <=range.second; i++)
    {
        if (((double)sum)/((double)(range.second-range.first+1))==(double)in[i]) {
            return true;
        }
    }
    return false;
}


int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n;
    for (int x, i = 0; i < n; i++)
    {
        cin >> x;
        in.pb(x);
    }
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            pairs.pb(make_pair(i, j));
        }
    }
    for(pair<int, int> a: pairs){
        if (calc(a))ans++;
    }
    cout<<ans;
}