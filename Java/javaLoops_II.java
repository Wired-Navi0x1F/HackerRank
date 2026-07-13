import java.util.Scanner;

public class javaLoops_II {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // int sum = 0;
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int p = (b * ((int) (Math.pow(2, j))));

                sum += p;
                int s = (a + sum);
                System.out.print(" " + s);
            }
            System.out.println();
        }
        in.close();
    }
}