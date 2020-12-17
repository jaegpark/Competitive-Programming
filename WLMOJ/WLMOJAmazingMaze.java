import java.io.*;
import java.util.*;

public class WLMOJAmazingMaze {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int rowNum = readInt();
        int colNum = readInt();
        char[][] input = new char[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            input[i] = readLine().toCharArray();
        }
        for (int i = 2; i < colNum; i++) {
            char gate1 = input[0][i];
            char gate2 = input[rowNum - 1][i];
            if (gate1 == 'A' || gate1 == 'a' || gate1 == 'O' || gate1 == 'o' || gate1 == 'X') {
                char l1 = input[0][i - 1];
                char r1 = input[0][i + 1];
                if ((gate1 == 'A' && l1 == 'G' && r1 == 'G') || (gate1 == 'a' && (l1 == 'R' || r1 == 'R') || (gate1 == 'O' && (l1 == 'G' || r1 == 'G')) || (gate1 == 'o' && l1 == r1 && l1 == 'R') || (gate1 == 'X' && l1 != r1)))
                {
                    System.out.println("Down");
                } else System.out.println("Up");
            }
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
