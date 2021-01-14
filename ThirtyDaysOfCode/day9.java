import java.util.Scanner;

public class day9 {
    static void factorial(int n) {
        int nilai = 1;
        for (int i = n; i >= 1; i--) {
            nilai = nilai * i;
        }
        System.out.print(nilai);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        factorial(x);
        s.close();
    }
}
