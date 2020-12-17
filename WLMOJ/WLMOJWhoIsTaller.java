/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlmojwhoistaller;

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class WLMOJWhoIsTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int num = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start, end;
        LinkedList<Integer>[] adj = new LinkedList[num + 1];  //graph of who is taller than who
        for (int i = 0; i <= num; i++) {
            adj[i] = new LinkedList<Integer>();     // initializes the linkedlists at each index of the array
        }
        for (int i = 0, p, q; i < m; i++) {
            st = new StringTokenizer(br.readLine().trim());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
            adj[p].add(q);
        }
        st = new StringTokenizer(br.readLine().trim());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        // initialize bfs
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[num + 1];
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int v : adj[cur]) {  // goes to the linkedlist index of the vertex (that just popped)we are looking at, 
                //and transverses through it
                if (!visited[v]) {    // if we havn't visited this vertex
                    visited[v] = true;  // set that we've now visited this vertex
                    q.add(v);   // adds this vertex to the queue 
                }
            }
        }

        if (visited[end]) {
            System.out.println("yes");
        } else {
            boolean[] visited1 = new boolean[num + 1];
            q.add(end);
            visited1[end] = true;
            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int v : adj[cur]) {  // goes to the linkedlist index of the vertex (that just popped)we are looking at, 
                    //and transverses through it
                    if (!visited1[v]) {    // if we havn't visited this vertex
                        visited1[v] = true;  // set that we've now visited this vertex
                        q.add(v);   // adds this vertex to the queue 
                    }
                }
            }
            if (visited1[start]){
                System.out.println("no");
            }
            else{
                System.out.println("unknown");
            }
        }

    }

}
