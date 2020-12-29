import java.io.*;
import java.util.*;

public class simpleArraySum {
    static int simpleArray(int[] ar) {
        int a = 0;
        for (int i = 0; i < ar.length; i++) {
            a += ar[i];
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int ar[] = new int[x];

        int i = 0;
        while (i < x) {
            ar[i] = s.nextInt();
            i++;
        }

        System.out.println(simpleArray(ar));
    }
}
