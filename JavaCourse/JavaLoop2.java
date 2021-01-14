import java.util.Scanner;

public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();

        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];

        for (int i = 0; i < q; i++) {
            a[i] = s.nextInt();
            b[i] = s.nextInt();
            n[i] = s.nextInt();
        }

        for (int x = 0; x < q; x++) {
            int[] result = new int[n[x]];
            for (int i = 0; i < n[x]; i++) {
                if (i > 0) {
                    result[i] = (int) (result[i - 1] + Math.pow(2, i) * b[x]);
                } else {
                    result[i] = (int) ((a[x] + Math.pow(2, i) * b[x]));
                }
                System.out.print(result[i] + " ");
            }
            System.out.println(" ");
        }
        s.close();
    }
}
