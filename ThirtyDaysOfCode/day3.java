import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a > 20 && a % 2 == 0) {
            System.out.println("Not Weird");
        } else if (a <= 20 && a >= 6 && a % 2 == 0) {
            System.out.println("Weird");
        } else if (a >= 2 && a <= 5 && a % 2 == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
        s.close();
    }
}
