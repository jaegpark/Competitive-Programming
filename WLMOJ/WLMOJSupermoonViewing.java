import java.util.*;
import java.io.*;

public class WLMOJSupermoonViewing {
    static BufferedReader br;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int x1 = readInt();
        int y1 = readInt();
        int r1 = readInt();
        int x2 = readInt();
        int y2 = readInt();
        int r2 = readInt();
        double d = (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));   // distance between the centres of the two circles
        if (d >= r1 + r2) {// no solution
            pw.println(0);
            pw.close();
        } else if (d + r1 <= r2) { // inside the circles
            pw.println(Math.PI*r1*r1);
            pw.close();
        } else if (d + r2 <= r1) {
            pw.println(Math.PI*r2*r2);
            pw.close();
        } else if (d == 0 && r1 == r2) {    // same circle
            pw.println((Math.PI * r1 * r1));
            pw.close();
        } else {
            double circle1Angle = 2 * Math.toDegrees(Math.acos((Math.pow(r2, 2) - Math.pow(r1, 2) - Math.pow(d, 2)) / (-2 * r1 * d)));
            double circle2Angle = 2 * Math.toDegrees(Math.acos((Math.pow(r1, 2) - Math.pow(r2, 2) - Math.pow(d, 2)) / (-2 * r2 * d)));
            double circle1SectorArea = (((Math.PI / 360) * circle1Angle * Math.pow(r1, 2)) - ((1.0 / 2) * Math.pow(r1, 2) * Math.sin(Math.toRadians(circle1Angle))));
            double circle2SectorArea = (((Math.PI / 360) * circle2Angle * Math.pow(r2, 2)) - ((1.0 / 2) * Math.pow(r2, 2) * Math.sin(Math.toRadians(circle2Angle))));
            pw.println((circle1SectorArea + circle2SectorArea));
            pw.close();
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