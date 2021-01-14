import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(a + " x " + i + " = " + a*i);
        }
        s.close();
    }
}
