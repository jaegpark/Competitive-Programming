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

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    ll n; cin >> n;
    vector<ll> in(n);
    for (ll i = 0; i < n; i++) {
        cin >> in[i];
        //in[i] = abs(in[i]);
    }
    
    sort(in.begin(), in.end());
    
    vector<ll> dp(n);
    dp[0]=0;
    for (ll i = 1; i < n; i++) {
        if (in[i] == in[i-1]) {
            dp[i] = dp[i-1];
        } else {
            dp[i] = dp[i-1]+i;
        }
    }
    cout << dp[n-1];
}