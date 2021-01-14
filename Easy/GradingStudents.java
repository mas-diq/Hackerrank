import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 38) {
                arr2[i] = ((arr1[i] / 5) + 1) * 5;
                if (arr2[i] % arr1[i] < 3) {
                    arr1[i] = arr2[i];
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }
        s.close();
    }
}