import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[s.nextInt()];

        s.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            char[] ch = new char[arr[i].length()];

            for (int j = 0; j < arr[i].length(); j++) {
                ch[j] = arr[i].charAt(j);
            }
            for (int k = 0; k < arr[i].length(); k += 2) {
                System.out.print(ch[k]);
            }
            System.out.print(" ");
            for (int l = 1; l < arr[i].length(); l += 2) {
                System.out.print(ch[l]);
            }
            System.out.println(" ");
        }
        s.close();
    }
}
