import java.util.*;
import java.io.*;

public class DMOJChooseyourownpath {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int numPage = Integer.parseInt(st.nextToken());
        LinkedList<Integer>[] adj = new LinkedList[numPage + 1];
        for (int i = 0; i < numPage + 1; i++) {
            adj[i] = new LinkedList<>();
        }
        for (int i = 1, m; i <= numPage; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            if (m == 0) adj[i].add(0);
            else {
                for (int j = 0; j < m; j++) {
                    adj[i].add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        // implement BFS
        boolean[] visited = new boolean[numPage + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1]= false;
        int [] distance = new int [numPage+1];
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int v : adj[cur]) {  // goes to the linkedlist index of the vertex (that just popped)we are looking at,
                //and transverses through it
                if (!visited[v]) {    // if we havn't visited this vertex
                    visited[v] = true;  // set that we've now visited this vertex
                    q.add(v);   // adds this vertex to the queue
                    distance[v] = distance[cur] + 1;
                }
            }
        }
        boolean valid = true;
        for (int i = 2; i <= numPage; i++) {
            if (!visited[i]) {
                valid = false;
                break;
            }
        }
        System.out.println(valid ? "Y" : "N");
        System.out.println(distance[0]);

    }
}
