import java.io.*;
import java.util.*;

public class DMOJFloorPlan {
    static BufferedReader br;
    static StringTokenizer st;
    static int rowNum, colNum;
    static ArrayList<Integer> areas;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int numTile = readInt();
        rowNum = readInt();
        colNum = readInt();
        areas = new ArrayList<Integer>();
        char[][] input = new char[rowNum + 1][colNum + 1];
        visited = new boolean[rowNum + 1][colNum + 1];
        for (int i = 1; i <= rowNum; i++) { // initialize the character array
            String s = readLine();
            for (int j = 1; j <= colNum; j++) {
                if (s.charAt(j - 1) == 'I') {
                    visited[i][j] = true;
                }
                input[i][j] = s.charAt(j - 1);
            }
        }
        int roomcount = 0;
        int counter = 0;
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 1; j <= colNum; j++) {
                if (!visited[i][j]) {
                    roomcount++;
                    Queue<Integer> q = new LinkedList<Integer>();
                    Queue<Integer> qq = new LinkedList<Integer>();
                    q.add(i);       // row number
                    qq.add(j);      // col number
                    counter = 0;    // counts the number of grids in this room
                    visited[i][j] = true;   // sets it so that we visited this area
                    while (!q.isEmpty()) {  // bfs
                        int cur = q.poll(); // pops the row number
                        int cur1 = qq.poll();   //pops the col number
                        if (cur1 < colNum) {  // check if we can move right from this position (check if not on of grid) (checks the COL NUMBER)
                            if (!visited[cur][cur1 + 1]) {    // if we didn't visit this place on the right (not a wall),
                                q.add(cur);     // add the new place to queue
                                qq.add(cur1 + 1); // etc
                                visited[cur][cur1 + 1] = true;
                                counter++;
                            }
                        }
                        if (cur1 > 1) {   // check if we can move left of this piece
                            if (!visited[cur][cur1 - 1]) {    // check if its a wall again
                                q.add(cur);
                                qq.add(cur1 - 1);
                                visited[cur][cur1 - 1] = true;
                                counter++;

                            }
                        }
                        if (cur < rowNum) { // down moving this time  MOOOOOVING
                            if (!visited[cur + 1][cur1]) {    //blah blah this should work
                                q.add(cur + 1);
                                qq.add(cur1);
                                visited[cur + 1][cur1] = true;
                                counter++;
                            }
                        }
                        if (cur > 1) {     // up
                            if (!visited[cur - 1][cur1]) {
                                q.add(cur - 1);
                                qq.add(cur1);
                                visited[cur - 1][cur1] = true;
                                counter++;
                            }
                        }
                    }
                    areas.add(counter + 1);
                }
            }
        }
        Collections.sort(areas);
        Collections.reverse(areas);
        int ansr = 0;
        for (int i = 0; i < roomcount; i++) {
            if (numTile - areas.get(i) >= 0) {
                ansr++;
                numTile = numTile - areas.get(i);
            } else break;
        }
        if (ansr == 1) System.out.println(ansr + " room, " + numTile + " square metre(s) left over");
        else
            System.out.println(ansr + " rooms, " + numTile + " square metre(s) left over");

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
