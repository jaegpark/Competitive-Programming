import java.io.*;
import java.util.*;

public class DMOJMaze {
    static BufferedReader br;
    static StringTokenizer st;
    static char[][] maze;
    static boolean[][] visited;
    static int rowNum;
    static int colNum;

    public static boolean valid(int x, int y) {
        if (x > -1 && x < rowNum && y > -1 && y < colNum) {
            if (maze[x][y] != '*')
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = readInt();    // the number of test cases i must do
        for (int i = 0; i < caseNum; i++) { // for each test case..........
            rowNum = readInt(); // number of rows in the new maze
            colNum = readInt(); // number of columns in the new maze
            maze = new char[rowNum][colNum];    // create a new char 2d array to map out the maze
            visited= new boolean[rowNum][colNum];  //  create a new visited array with same size
            for (int j = 0; j < rowNum; j++) {  // goes through each row of input
                maze[j] = readLine().toCharArray(); // converts into char array for each line
            }
            int[][] distance = new int[rowNum][colNum]; // create a distance array to see how many moves it takes to get to the final position
            Queue<Integer> q = new LinkedList<Integer>();   // row number queue
            Queue<Integer> qq = new LinkedList<Integer>();  // ccolumn number queue
            q.add(0);   // add 0 to both queues because we're starting at the top left corner
            qq.add(0);
            visited[0][0] = true;   // set so that we visited itself already
            distance[0][0] = 0; // initialize distance
            while (!q.isEmpty()) {  //bfs
                int curr = q.poll();    // current row number
                int curc = qq.poll();   // current column number
                char temp = maze[curr][curc];   // temp represents what character we are on in the maze
                if (temp == '-') {      // if we are at a minus (we can only move left or right)
                    if (valid(curr, curc + 1) && !visited[curr][curc + 1]) {    // check if there is a spot on the grid to the right, that we havnt visited
                        q.add(curr);    // if this place is new, we add it to the queues
                        qq.add(curc + 1);
                        visited[curr][curc + 1] = true; // set it so that this new place is now visited
                        distance[curr][curc + 1] = distance[curr][curc] + 1;    //add one to distance for this place
                    }
                    if (valid(curr, curc - 1) && !visited[curr][curc - 1]) {    // same deal over here but we check the left
                        q.add(curr);
                        qq.add(curc - 1);
                        visited[curr][curc - 1] = true;
                        distance[curr][curc - 1] = distance[curr][curc] + 1;
                    }
                } else if (temp == '|') {   // if we can only move up/down from this point,
                    if (valid(curr - 1, curc) && !visited[curr - 1][curc]) {    // same procedure
                        q.add(curr - 1);
                        qq.add(curc);
                        visited[curr - 1][curc] = true;
                        distance[curr - 1][curc] = distance[curr][curc] + 1;

                    }
                    if (valid(curr + 1, curc) && !visited[curr + 1][curc]) {// etc
                        q.add(curr + 1);
                        qq.add(curc);
                        visited[curr + 1][curc] = true;
                        distance[curr + 1][curc] = distance[curr][curc] + 1;
                    }
                } else if (temp == '+') {   // if it is a plus sign, which means we can move vertically and horizontally, we do what we did for - and |
                    if (valid(curr - 1, curc) && !visited[curr - 1][curc]) {
                        q.add(curr - 1);
                        qq.add(curc);
                        visited[curr - 1][curc] = true;
                        distance[curr - 1][curc] = distance[curr][curc] + 1;

                    }
                    if (valid(curr + 1, curc) && !visited[curr + 1][curc]) {
                        q.add(curr + 1);
                        qq.add(curc);
                        visited[curr + 1][curc] = true;
                        distance[curr + 1][curc] = distance[curr][curc] + 1;
                    }
                    if (valid(curr, curc + 1) && !visited[curr][curc + 1]) {
                        q.add(curr);
                        qq.add(curc + 1);
                        visited[curr][curc + 1] = true;
                        distance[curr][curc + 1] = distance[curr][curc] + 1;
                    }
                    if (valid(curr, curc - 1) && !visited[curr][curc - 1]) {
                        q.add(curr);
                        qq.add(curc - 1);
                        visited[curr][curc - 1] = true;
                        distance[curr][curc - 1] = distance[curr][curc] + 1;
                    }
                }
            }   // once we have traversed the maze, we check if it is possible to reach the end
            System.out.println(visited[rowNum-1][colNum-1]?(distance[rowNum-1][colNum-1]+1):(-1));

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
