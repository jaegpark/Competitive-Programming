/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author jyl10
 */

import java.io.*;
import java.util.*;

public class WLMOJMinecraft {
    static BufferedReader br;
    static StringTokenizer st;
    static LinkedList<Integer>[] adj;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();      // duck time
        boolean[][] visited = new boolean[n + 1][n + 1];    // najes a new boolean array so we dont fuck up our bfs
        int startx = 0, starty = 0, endx = 0, endy = 0;     // stores the row num and col num for start and ending points
        for (int i = 1; i <= n; i++) {  //  goes through each line
            String s = readLine();  // reads the line
            for (int j = 1; j <= n; j++) {  // goes through the characters in each line
                if (s.charAt(j - 1) == '#') {   // checks if it is a wall
                    visited[i][j] = true;       // if its a wall it sets that place to true so we dont visit it during bfs
                }
                if (s.charAt(j - 1) == 'S') {   // checks if it is starting point- if so it marks the two values to the indicies
                    startx = i;
                    starty = j;
                }
                if (s.charAt(j - 1) == 'E') {   // same procedure as above for the ending point
                    endx = i;
                    endy = j;
                }
            }
        }
        // X IS ROW NUMBER DIPSHIT
        // Now we know where everything is in the 2d array.
        Queue<Integer> q = new LinkedList<Integer>();   // queue for the row numbers of a point
        Queue<Integer> qq = new LinkedList<Integer>();  // queue for the column numbers of a point
        int distance[][] = new int[n + 1][n + 1];       // creates a new 2d distance array
        distance[startx][starty] = 0;   // sets the starting pos distance to 0
        q.add(startx);  // adds the starting row num to respective queue
        qq.add(starty); // adds the starting col num to respective queue
        visited[startx][starty] = true; // sets that we visited this hellhole already
        while (!q.isEmpty()) {  //blah blah regular bfs declaration
            int cur = q.poll(); // pops the row number
            int cur1 = qq.poll();   //pops the col number
            if (cur1 < n) {  // check if we can move right from this position (check if not on of grid) (checks the COL NUMBER)
                if (!visited[cur][cur1+1]) {    // if we didn't visit this place on the right (not a wall),
                    q.add(cur);     // add the new place to queue
                    qq.add(cur1+1); // etc
                    distance[cur][cur1+1] = distance[cur][cur1] + 1;    // set this place's distance to +1
                    visited[cur][cur1+1]= true;
                }
            }
            if (cur1 > 1) {   // check if we can move left of this piece
                if (!visited[cur][cur1-1]) {    // check if its a wall again
                    q.add(cur);
                    qq.add(cur1-1);
                    distance[cur][cur1-1] = distance[cur][cur1] + 1;
                    visited[cur][cur1-1] = true;

                }
            }
            if (cur < n) { // down moving this time  MOOOOOVING
                if (!visited[cur+1][cur1]) {    //blah blah this should work
                    q.add(cur+1);
                    qq.add(cur1);
                    distance[cur+1][cur1] = distance[cur][cur1] + 1;
                    visited[cur+1][cur1] = true;

                }
            }
            if (cur > 1) {     // up
                if (!visited[cur-1][cur1]) {
                    q.add(cur-1);
                    qq.add(cur1);
                    distance[cur-1][cur1] = distance[cur][cur1] + 1;
                    visited[cur-1][cur1] = true;
                }
            }
        }
        if (!visited[endx][endy]) System.out.println("There is no path, Andy!");
        else {
            System.out.println(distance[endx][endy]);
        }
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
