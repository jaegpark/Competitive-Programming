import java.util.*;
import java.io.*;

public class DMOJFriends {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int numStudents = Integer.parseInt(st.nextToken());
        LinkedList<Integer>[] adj = new LinkedList[10000];
        for (int i = 0; i <= 9999; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        for (int i = 0, x, y; i < numStudents; i++) {
            st = new StringTokenizer(br.readLine().trim());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
        }
        while (true) {
            st = new StringTokenizer(br.readLine().trim());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            if (p == 0 &&q == 0){
                break;
            }
            // Initalize bfs
            boolean[] visited = new boolean[10000];
            int[] distance = new int[10000];
            Queue<Integer> qu = new LinkedList<Integer>();
            qu.add(p);
            visited[p] = true;
            while (!qu.isEmpty()) {
                int cur = qu.poll();
                for (int v : adj[cur]) {
                    if (!visited[v]) {    // if we havn't visited this vertex
                        visited[v] = true;  // set that we've now visited this vertex
                        qu.add(v);   // adds this vertex to the queue
                        distance[v] = distance[cur] + 1;
                    }
                }
            }
            System.out.println(visited[q]?"Yes "+(distance[q]-1):"No");

        }
    }
}
