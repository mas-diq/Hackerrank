import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        String[] tempt = new String[x];
        Long[] n = new Long[x];
        boolean[] ket = new boolean[x];
        boolean[] baite = new boolean[x];
        boolean[] shrt = new boolean[x];
        boolean[] integ = new boolean[x];
        boolean[] longinteg = new boolean[x];

        // input ke string tempt
        for (int i = 0; i < x; i++) {
            tempt[i] = s.next();

            try {
                n[i] = Long.parseLong(tempt[i]);
                ket[i] = true;
            } catch (Exception e) {
            }
        }

        for (int i = 0; i < x; i++) {
            if (ket[i]) {
                System.out.println(n[i] + " can be fitted in:");
                // cek apakah termasuk diantara ini
                if (((n[i] >= -Math.pow(2, 63)) && (n[i] <= Math.pow(2, 63) - 1))) {
                    longinteg[i] = true;
                    if (((n[i] >= -Math.pow(2, 31)) && (n[i] <= Math.pow(2, 31) - 1))) {
                        integ[i] = true;
                        if ((n[i] >= -32768) && (n[i] <= 32767)) {
                            shrt[i] = true;
                            if ((n[i] >= -128) && (n[i] <= 127)) {
                                baite[i] = true;
                            }
                        }
                    }
                }

                if (baite[i]) {
                    System.out.println("* byte");
                }
                if (shrt[i]) {
                    System.out.println("* short");
                }
                if (integ[i]) {
                    System.out.println("* int");
                }
                if (longinteg[i]) {
                    System.out.println("* long");
                }
            } else {
                tempt[i] = tempt[i] + " can't be fitted anywhere.";
                System.out.println(tempt[i]);
            }
            s.close();
        }
    }
}
