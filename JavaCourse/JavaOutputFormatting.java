import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        int[] x = new int[3];

        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
            x[i] = sc.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s",str[i]);
            System.out.printf("%03d%n",x[i]);
        }
        System.out.println("================================");
        sc.close();
    }
}
