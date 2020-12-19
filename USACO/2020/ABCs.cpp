#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using ld = long double;
using db = double; 
using str = string;

#define pb push_back
#define pf push_front

/*
This solution was given 10/10 on the test cases
*/




int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int a, b, c;
    vector<int> in;
    for (int x, i = 0; i < 7; i++)
    {
        cin>>x;
        in.pb(x);
    }
    std::sort(in.begin(), in.end());
    a=in[0];
    b=in[1];

    for (int i = 0; i < 7; i++)
    {
        in[i] = in[i]-(a+b);
    }
    cout << a<<" "<<b<<" "<<in[6];
    

}