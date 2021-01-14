import java.util.Arrays;

import java.io.*;
import java.util.*;

public class minMaxSum {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        long ar[] = new long[5];

        int x = 0;
        while (x < 5) {
            ar[x] = s.nextLong();
            x++;
        }

        Arrays.sort(ar);
        long min = 0;
        long max = 0;


        int a = 0;
        while (a < 4) {
            min = min + ar[a];
            a++;
        }

        int b = 1;
        while (b < 5) {
            max = max + ar[b];
            b++;
        }
        System.out.print(min + " " + max);
        s.close();
    }
}
