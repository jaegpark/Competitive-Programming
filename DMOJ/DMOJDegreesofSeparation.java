/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */

/**
 *
 * @author jyl10
 */
import java.util.*;
import java.io.*;

public class DMOJDegreesofSeparation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer>[] adj = new LinkedList[50];
        for (int i = 0; i < 50; i++) {
            adj[i] = new LinkedList<Integer>();     // initializes the linkedlists at each index of the array
        }
        adj[1].add(6);
        adj[2].add(6);
        adj[3].addAll(Arrays.asList(4, 5, 6, 15));
        adj[4].addAll(Arrays.asList(3, 5, 6));
        adj[5].addAll(Arrays.asList(3, 4, 6));
        adj[6].addAll(Arrays.asList(1, 2, 3, 4, 5, 7));
        adj[7].addAll(Arrays.asList(6, 8));
        adj[8].addAll(Arrays.asList(7, 9));
        adj[9].addAll(Arrays.asList(8, 10, 12));
        adj[10].addAll(Arrays.asList(9, 11));
        adj[11].addAll(Arrays.asList(10, 12));
        adj[12].addAll(Arrays.asList(9, 11, 13));
        adj[13].addAll(Arrays.asList(12, 14, 15));
        adj[14].add(13);
        adj[15].addAll(Arrays.asList(3, 13));
        adj[16].addAll(Arrays.asList(17, 18));
        adj[17].addAll(Arrays.asList(16, 18));
        adj[18].addAll(Arrays.asList(16, 17));
        while (true) {
            String choice = br.readLine();
            if (choice.equals("q")) {
                break;
            } else if (choice.equals("i")) {
                int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
                if (!adj[x].contains(y)) {
                    adj[x].add(y);
                    adj[y].add(x);
                }

            } else if (choice.equals("d")) {
                int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
                adj[x].removeFirstOccurrence(y);
                adj[y].removeFirstOccurrence(x);
            } else if (choice.equals("n")) {
                int x = Integer.parseInt(br.readLine());
                System.out.println(adj[x].size());
            } else if (choice.equals("f")) {
                int x = Integer.parseInt(br.readLine());
                int k = 0;
                boolean[] friends = new boolean[50];
                friends[x] = true;
                for (int j = 0; j < adj[x].size(); j++) {
                    friends[adj[x].get(j)] = true;
                }
                for (int j = 0; j < adj[x].size(); j++) {
                    for (int l = 0; l < adj[adj[x].get(j)].size(); l++) {
                        if (!friends[adj[adj[x].get(j)].get(l)]) {
                            k += 1;
                            friends[adj[adj[x].get(j)].get(l)] = true;
                        }
                    }
                }
                System.out.println(k);
            } else if (choice.equals("s")) {
                // initialize bfs
                Queue<Integer> q = new LinkedList<Integer>();
                boolean[] visited = new boolean[50];
                int[] distance = new int[50];
                int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
                q.add(x);
                visited[x] = true;  // sets in the boolean array that a has been visited
                while (!q.isEmpty()) {    // continues to run if queue is not empty
                    int cur = q.poll(); // pops the first in queue
                    for (int v : adj[cur]) {  // goes to the linkedlist index of the vertex (that just popped)we are looking at, 
                        //and transverses through it
                        if (!visited[v]) {    // if we havn't visited this vertex
                            visited[v] = true;  // set that we've now visited this vertex
                            q.add(v);   // adds this vertex to the queue 
                            distance[v] = distance[cur] + 1;
                        }
                    }
                } // now knows x can go to y
                if (!visited[y]) {
                    System.out.println("Not connected");
                } else {
                    System.out.println(distance[y]);
                }
            }

        }
    }
}
