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

int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int R, Q;
    cin>>R>>Q;
    bool arr[2*R+1][2*R+1];//r == middle
    arr[R][2*R]=true;
    //for (int i = 2*R; i>=0; i--){

    //}

    for (int x, y, i = 0; i<Q; i++){
        int rd, rdu, rdd, rdl, rdr, rdul, rdur, rddl, rddr;
        rd=pow(x,2)+pow(y,2)-R;
        rdu=pow(x,2) + pow(y+1,2)-R;
        rdd=pow(x,2) + pow(y-1,2)-R;
        rdl=pow(x-1,2) + pow(y,2)-R;
        rdr=pow(x+1,2) + pow(y,2)-R;
        rdul=pow(x-1,2) + pow(y+1,2)-R;
        rdur=pow(x+1,2) + pow(y+1,2)-R;
        rddl=pow(x-1,2) + pow(y-1,2)-R;
        rddr=pow(x+1,2) + pow(y-1,2)-R;
        //strictly greater?
        if (! rd < rdu && rd < rdd && rd<rdl && rd < rdr && rd < rdul && rd < rdur && rd < rddl && rd < rddr){
            cout<<i<<" ";
        }
    }
    
     
    
}