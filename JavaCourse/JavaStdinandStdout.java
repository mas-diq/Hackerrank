import java.util.Scanner;

public class JavaStdinandStdout {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        double d = s.nextDouble();
        s.nextLine();
        String ss = s.nextLine();
        System.out.println("String: " + ss);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        s.close();
    }
}