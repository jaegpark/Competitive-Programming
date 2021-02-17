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

    int N, M, K, ans=0;
    

int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    cin>>M>>N>>K;
    int rows [M];
    int columns[N] ;
    for(int i = 0; i<N; i++){
        columns[i]=0;
    }
    for(int i = 0; i<M; i++){
        rows[i]=0;
    }
    for(int in, i =0; i< K; i++){
        char c;
        cin>>c>>in;

        if (c=='C'){
            columns[in-1]+=1;
        }else if (c=='R'){
            rows[in-1]+=1;
        }
    }
    for(int i = 0; i<M; i++){
        for(int j = 0; j < N; j++){
            if ((rows[i] + columns[j])%2==1){
                //cout<<(rows[i] + columns[j])<<" ";
                ans+=1;
            }
        }
    }
    cout<<ans;
}