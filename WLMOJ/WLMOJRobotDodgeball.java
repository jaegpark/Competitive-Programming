import java.io.*;
import java.util.*;

public class WLMOJRobotDodgeball {
    static BufferedReader br;
    static StringTokenizer st;
    static int numBot, onTeam1;
    static LinkedList<Integer>[] adj;
    static boolean[] visited;    // visited array to see if we've reached that vertex


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        numBot = readInt();
        onTeam1 = readInt();
        adj = new LinkedList[numBot + 1];
        for (int i = 1; i <= numBot; i++) {
            adj[i] = new LinkedList<Integer>();     // initializes the linkedlists at each index of the array
        }
        boolean[] gotHit = new boolean[numBot + 1]; // this keeps track of the robots that got hit by a dodgeball
        for (int i = 1, x; i <= numBot; i++) {        // this for loop goes through each line of action input
            x = readInt();  // this reads the number of actions for this robot
            for (int j = 0, y; j < x; j++) {    // this goes through the line of actions
                y = readInt();  // reads the target
                adj[i].add(y);  // adds the target to the row number's adj array
                adj[y].add(i);  // vice versa since the graph is bidirectional
                gotHit[y] = true;
            }
        }
        visited = new boolean[numBot + 1];
        int [] distance = new int[numBot+1];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(onTeam1);
        int numTeam1 = 0, numTeam2 = 0;
        distance[onTeam1] = 0;
        boolean[] team1 = new boolean[numBot + 1];
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i : adj[cur]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    distance[i] = distance[cur] + 1;
                    if (distance[i] % 2 == 0) {
                        team1[i] = true;
                    }
                }
            }
        }
        // now we know who was eliminated, and we know what team each robot is on.
        int numElimOn1 = 0, numElimOn2 = 0;
        for (int i = 1; i <= numBot; i++) {
            if (team1[i] && gotHit[i]) numElimOn1++;  // if the robot number is on team 1 and got hit
            else if (!team1[i] && gotHit[i]) numElimOn2++;
        }
        // now we know how many people on each team got eliminated.
        for (int i = 1; i <= numBot; i++) {
            if (team1[i]){
                numTeam1++;
            }
            else numTeam2++;
        }
        // now we know how many people are on each team
        pw.println((numTeam1 - numElimOn1) + " " + (numTeam2 - numElimOn2));
        pw.close();
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
