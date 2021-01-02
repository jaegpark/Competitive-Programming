#include <iostream>
#include <vector>
#include <queue>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

using ll = long long;
using ld = long double;
using db = double;
using str = string;

#define pb push_back
#define pf push_front
#define mp make_pair

class Graph
{
public:

    vector<vector<int>> Edge;
    vector<bool> visited;

    Graph(int V)
    {
        Edge.resize(V+1);
        visited.resize(V+1);
        for(int i = 0; i<=V; i++){
            visited[i]=false;
        }
    }

    bool ans(int v){
        return visited[v];
    }

    void add_edge(int v, int w)
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
};

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int numHouses, numRoads, sh, date;
    cin >> numHouses >> numRoads >> sh >> date;
    Graph g(numHouses);

    for (int a, b, i = 0; i < numRoads; i++)
    {
        cin>>a>>b;
        g.add_edge(a,b);
        g.add_edge(b,a);
    }
    g.BFS(sh);
    if(g.ans(date)){
        cout<<"GO SHAHIR!";
    }else{
        cout<<"NO SHAHIR!";
    }
}