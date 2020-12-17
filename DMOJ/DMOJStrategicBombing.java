
import java.util.*;
import java.io.*;

public class DMOJStrategicBombing {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));  // shit
        boolean[][] adj = new boolean[26][26];  // adjacency matrix for alphabet
        int num = 0;    // number of such roads
        ArrayList<String> qq = new ArrayList<String>();
        String s = next();  // reads the line of input
        while (!s.equals("**")) {      // this while loop reads in the input
            char a = s.charAt(0);   // else we hadd the lettes into the qq queue
            char b = s.charAt(1);
            adj[a - 'A'][b - 'A'] = true;  // sets accordingly
            adj[b - 'A'][a - 'A'] = true;
            qq.add(s);
            s = next();
        }
        for (String v : qq) {
            char temp = v.charAt(0);  // start of path we are removing
            char temp1 = v.charAt(1); // end of path we are removing
            adj[temp - 'A'][temp1 - 'A'] = false;// removes this path in the adj matrix to see if it is a disconnecting road
            adj[temp1 - 'A'][temp - 'A'] = false;

            // bfs
            boolean[] visited = new boolean[26];    // vis array for bfs
            Queue<Integer> q = new LinkedList<Integer>();   // make a new queue
            q.add(0);   // add the numerical equivalent of 'A' - 'A'
            visited[0] = true;
            while (!q.isEmpty()) {
                int cur = q.poll();     // regular stuff
                for (int i = 0; i < 26; i++) {  // goes through this letter's adj list
                    if (adj[cur][i] && !visited[i]) {  // if it is 1 and we havnt visited thjis place
                        visited[i] = true;  // we set it to true
                        q.add(i);// add this number back to queue
                    }
                }
            }
            if (!visited[1]) {  // if b was not visited
                System.out.println("" + temp + temp1);    // this is a disconnecting road
                num++;
            }
            adj[temp - 'A'][temp1 - 'A'] = true;   // reset these to connected
            adj[temp1 - 'A'][temp - 'A'] = true;
        }
        System.out.println("There are " + num + " disconnecting roads.");
    }


    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
