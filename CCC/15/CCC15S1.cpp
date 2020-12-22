#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using ld = long double;
using db = double;
using str = string;

#define pb push_back
#define pf push_front
#define mp make_pair

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    stack<int> s;
    int n, sum=0;
    cin>>n;
    for (int x, i = 0; i < n; i++)
    {
        cin>>x;
        if (x==0){
            s.pop();
        }else {
            s.push(x);
        }
    }
    while(!s.empty()){
        sum += s.top();
        s.pop();
    }
    cout<<sum;
    
    
}