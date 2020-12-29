import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int ax = s.nextInt();
        int ar[][] = new int[ax][ax];

        for (int x = 0; x < ax; x++) {
            for (int y = 0; y < ax; y++) {
                ar[x][y] = s.nextInt();
            }
        }

        int d1 = 0;
        int d2 = 0;

        for (int y = 0; y < ax; y++) {
            d1 = d1 + ar[y][y];
            d2 = d2 + ar[ax - 1 - y][y];
        }
        System.out.println(Math.abs(d1 - d2));
    }
}