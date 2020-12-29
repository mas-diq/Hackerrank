import java.io.*;
import java.util.*;

public class plusMinus {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int ax = s.nextInt();
        int ar[] = new int[ax];

        int x = 0;
        while (x < ax) {
            ar[x] = s.nextInt();
            x++;
        }

        double pos = 0;
        double neg = 0;
        double zer = 0;
        for (int i = 0; i < ax; i++) {
            if (ar[i] > 0) {
                pos = pos + 1;
            } else if (ar[i] < 0) {
                neg = neg + 1;
            } else {
                zer = zer + 1;
            }
        }

        System.out.println(pos / ax);
        System.out.println(neg / ax);
        System.out.println(zer / ax);
    }
}
