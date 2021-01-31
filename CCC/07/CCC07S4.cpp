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

int n;

class Graph
{
    vector<vector<int>> Edge;
    vector<bool> visited;
    vector<int> numPaths;
public:
    Graph(int V)
    {
        Edge.resize(V+1);
        visited.resize(V+1);
        numPaths.resize(V+1);
        for(int i = 0; i<=V; i++){
            visited[i]=false;
        }
    }

    bool checkVisit(int v){
        return visited[v];
    }

    void addEdge(int v, int w)
    {
        Edge[v].push_back(w);
    }

    void BFS(int s)
    {
        queue<int> q;
        visited[s] = true;
        q.push(s);
        while (!q.empty())
        {
            s = q.front();
            q.pop();
            for (auto i : Edge[s])
            {
                if (!visited[i])
                {
                    visited[i] = true;
                    q.push(i);
                }
            }
        }
    }

    void countpath(){
        numPaths[1]=1;
        for(int i = 1; i<=n; i++){
            for(int v : Edge[i]){
                numPaths[v]+=numPaths[i];
            }
        }
    }
    int path(int where){
        return numPaths[where];
    }
};

int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    //variable decl
    
    cin>>n;

    Graph g(n);

    int x, y;
    cin>>x>>y;
    while(x!=0 && y!=0){
        g.addEdge(x, y);
        cin>>x>>y;
    }
    g.countpath();
    cout<<g.path(n);

}