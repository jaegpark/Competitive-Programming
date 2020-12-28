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
//TODO: doesn't work for first test case 
#define pb push_back
#define pf push_front
#define mp make_pair

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    str input = "";
    int count = 0;
    int sum = 0;
    cin >> input;
    char letters[input.length()+1];
    

    strcpy(letters, input.c_str());
    int cur = 0, cardCount=0;
    cout << "Cards Dealt Points" << endl;
    while (cur != input.length())
    {
        char i = input[cur];
        switch (i)
        {
            // point values based on card
            case 'A':
            {
                count += 4;
                cardCount++;
                cout << i<<" ";
                break;
            }
            case 'K':
            {
                count += 3;
                cardCount++;
                cout << i<<" ";
                break;
            }
            case 'Q':
            {
                count += 2;
                cardCount++;
                cout << i<<" ";
                break;
            }
            case 'J':
            {
                count += 1;
                cardCount++;
                cout << i<<" ";
                break;
            }
            //case work for new line (output points)
            case 'C':
            {
                if (cardCount==0){
                    count+=3;
                }else if (cardCount==1){
                    count+=2;
                }else if (cardCount==2){
                    count+=1;
                }
                cout << "Clubs ";
                count = 0;
                cardCount= 0;
                break;
            }
            case 'D':
            {
                if (cardCount==0){
                    count+=3;
                }else if (cardCount==1){
                    count+=2;
                }else if (cardCount==2){
                    count+=1;
                }
                sum+=count;
                cout << count << "\n"<< "Diamonds ";
                count = 0;
                cardCount= 0;
                break;
            }
            case 'H':
            {
                if (cardCount==0){
                    count+=3;
                }else if (cardCount==1){
                    count+=2;
                }else if (cardCount==2){
                    count+=1;
                }
                sum+=count;
                cout << count << "\n" << "Hearts ";
                count = 0;
                cardCount= 0;
                break;
            }
            case 'S':
            {
                if (cardCount==0){
                    count+=3;
                }else if (cardCount==1){
                    count+=2;
                }else if (cardCount==2){
                    count+=1;
                }
                sum+=count;
                cout << count << "\n"<< "Spades ";
                count = 0;
                cardCount=0;
                break;
            }
            default: {
                cout<<i<<" ";
                cardCount++;
                break;
            }
        }
        cur++;
    }
    sum+=count;
    cout<<count<<endl;
    cout<<"Total "<<sum;
}