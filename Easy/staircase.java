import java.io.*;
import java.util.*;

public class staircase {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int ax = s.nextInt();

        // for (int a = 0; a < ax; a++) {
        for (int b = 0; b < ax; b++) {
            for (int c = 0; c < ax - b - 1; c++) {
                System.out.print(" ");
            }
            for (int d = 0; d < b + 1; d++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
