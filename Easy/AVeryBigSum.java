import java.io.*;
import java.util.*;

public class AVeryBigSum {
    //test
    static long aVeryBigSum(long[] ar) {
        long a = 0;
        for (int i = 0; i < ar.length; i++) {
            a = a + ar[i];
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        long ar[] = new long[x];

        int i = 0;
        while (i < x) {
            ar[i] = s.nextInt();
            i++;
        }

        System.out.println(aVeryBigSum(ar));
    }
}
