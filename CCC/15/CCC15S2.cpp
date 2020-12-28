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

int arr [10000000];
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
   
    int count =0;
    int j, a;
    cin>>j>>a;
    
    for (int i = 1; i<=j; i++){
        char s;
        cin>>s;
        if (s=='S'){
            arr[i]=1;
        }else if (s=='M'){
            arr[i]=2;
        }else if (s=='L'){
            arr[i]=3;
        }
    }
    for(int i = 1; i<=a; i++){
        char s;
        int size, index;
        cin>>s>>index;
        if (s=='S'){
            size=1;
        }else if (s=='M'){
            size=2;
        }else if (s=='L'){
            size=3;
        }
        if (index>0 && index<=j && arr[index]>=size){
            arr[index]=-1;
            count+=1;
        }
    }
    cout<<count;

    
}