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
#include <sstream>
#include <iomanip>


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
    int N;
    long double ans=0;
    cin>> N;
    long double heights [N+1];
    for(int in, i = 0; i<= N; i++){
        cin>>in;
        heights[i]=in;
    }
    for(int in, i = 0; i< N; i++){
        cin>>in;
        ans += (long double)(in * (heights[i]+ heights[i+1]));
    }
    cout<<ans/2.0;
}