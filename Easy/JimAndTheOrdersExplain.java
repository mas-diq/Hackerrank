import java.util.Scanner;

public class JimAndTheOrdersExplain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] orders = new int[n][2];
        int[] waktu = new int[n];
        int[] urutan = new int[n];

        // input nilai ke array orders
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                orders[i][j] = s.nextInt();
                waktu[i] = waktu[i] + orders[i][j];
            }
            urutan[i] = i + 1;
        }

        System.out.println(" ");

        // Mengurutkan berdasarkan waktu
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (waktu[i] < waktu[j]) {

                    waktu[i] = waktu[i] + waktu[j];
                    waktu[j] = waktu[i] - waktu[j];
                    waktu[i] = waktu[i] - waktu[j];

                    urutan[i] = urutan[i] + urutan[j];
                    urutan[j] = urutan[i] - urutan[j];
                    urutan[i] = urutan[i] - urutan[j];
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(waktu[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        // cetak semua
        for (int i = 0; i < urutan.length; i++) {
            System.out.print(waktu[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < urutan.length; i++) {
            System.out.print(urutan[i] + " ");
        }

        s.close();
    }
}
