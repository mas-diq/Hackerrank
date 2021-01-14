import java.util.Scanner;
//blom selesai
public class day10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dec = s.nextInt();
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
        char y = '1';
        int x = 0;
        int total = 0;
        while (bin.charAt(x) == y){
            total++;
            x++;
        }
        System.out.println(total);
        s.close();
    }
}
