import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double x = s.nextDouble();
        s.nextLine();
        int d = s.nextInt();
        int t = s.nextInt();
        Double hasil = (x * d / 100) + (x * t / 100) + x;
        System.out.println(hasil);
        System.out.println((int)Math.floor(hasil + 0.5));
        s.close();
    }
}
