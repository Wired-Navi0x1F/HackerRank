import java.util.Scanner;

public class JavaStdinAndStdout_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double l = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println(s);
        System.out.println(l);
        System.out.println(n);
        scan.close();
    }
}