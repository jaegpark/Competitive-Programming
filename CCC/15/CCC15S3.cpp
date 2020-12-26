#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using ld = long double;
using db = double;
using str = string;

#define pb push_back
#define pf push_front
#define mp make_pair


int arr[1000000];


int main()
{   // 4 gates, 6 planes: 2 2 3 3 4 4
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);


    int numGate, numPlane;
    cin>>numGate>>numPlane;
    int ans=0;
    for(int g, i = 0; i<numPlane; i++){
        cin>>g;
        bool found = false;
        if (arr[g-1]==0){
            arr[g-1]=1;
            found = true;
            //cout<<"index that was filled is "<<g-1<<endl;
        }else if (arr[g-1]==1){ //plane already there
            for(int j=g-2; j>=0&&!found; j--){
                if (arr[j]==0){
                    arr[j]=1;
                    found = true;
                    //cout<<"index that was filled is "<<j<<endl;
                    break;
                }
            }
        }

        if (!found) break;
        else {
            ans +=1;
        }
    }
    cout<<ans;
    
}