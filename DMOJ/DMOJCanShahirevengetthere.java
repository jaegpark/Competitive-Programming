/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmojcanshahirevengetthere;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class DMOJCanShahirevengetthere {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numNode = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        LinkedList<Integer>[] adj = new LinkedList[numNode + 1];    // creates an array of linkedlists
        for(int i = 0; i <= numNode; i++){
            adj[i] = new LinkedList<Integer>();     // initializes the linkedlists at each index of the array
        }
        for(int i = 0, x ,y; i < m;i++){        // declares x and y in for loop and goes through until less than m, which is 
            x = sc.nextInt();   // takes in a vertex number
            y = sc.nextInt();   // takes in the vertex number it is adjacent to
            adj[x].add(y);  // at the vertex x, add y because x is connected to y
            adj[y].add(x);  // at the vertex y, add x beacuse y is connected to x (bidirectional)
        }
        boolean [] visited = new boolean[numNode+1];    // visited array to see if we've reached that vertex
        Queue<Integer> q = new LinkedList<Integer>();   // queue initialization for bfs
        q.add(a);   // adds the starting vertex number to the queue
        visited[a] = true;  // sets in the boolean array that a has been visited
        while(!q.isEmpty()){    // continues to run if queue is not empty
            int cur = q.poll(); // pops the first in queue
            for(int v : adj[cur]){  // goes to the linkedlist index of the vertex (that just popped)we are looking at, 
                    //and transverses through it
                if(!visited[v]){    // if we havn't visited this vertex
                    visited[v] = true;  // set that we've now visited this vertex
                    q.add(v);   // adds this vertex to the queue 
                }
            }
        }
        // once this while loop finishes, we will be able to see whether a specific vertex is reachable from the starting point.
        System.out.println(visited[b]?"GO SHAHIR!":"NO SHAHIR!");   // if it managed to visit (true) at b, then print YES. else NO.
    }

}
