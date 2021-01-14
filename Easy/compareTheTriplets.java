import java.io.*;
import java.util.*;

public class compareTheTriplets {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int as = 0, bs = 0;

        int i1 = 0;
        int i2 = 0;
        while (i1 < 3) {
            a[i1] = s.nextInt();
            i1++;
        }

        while (i2 < 3) {
            b[i2] = s.nextInt();
            i2++;
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                as += 1;
            } else if (a[i] < b[i]) {
                bs += 1;
            }
        }
        System.out.println(as + " " + bs);
        s.close();
    }
}
