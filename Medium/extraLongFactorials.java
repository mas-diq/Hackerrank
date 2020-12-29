import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class extraLongFactorials {
    static BigInteger kali(int n) {
        BigInteger f = new BigInteger("1");

        for (int i = n; i > 0; i--) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(kali(n));
    }
}
