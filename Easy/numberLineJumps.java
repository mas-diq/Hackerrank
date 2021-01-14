import java.io.IOException;
import java.util.Scanner;

public class numberLineJumps {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[4];

        int i = 0;
        while (i < 4){
            arr[i] = s.nextInt();
            i++;
        }
        int d1 = arr[0];
        int d2 = arr[2];

        while (d1 < d2) {
            d1 = d1 + arr[1];
            d2 = d2 + arr[3];
        }

        if (d1 == d2) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        s.close();
    }
}
