import java.util.*;

public class JavaStdinAndStdout_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        System.out.println("MyString is : " + s);

        int i = scan.nextInt();
        System.out.println("Integer is : " + i);

        int a = scan.nextInt();
        System.out.println(a);

        int b = scan.nextInt();
        System.out.println(b);

        int c = scan.nextInt();
        System.out.println(c);

        scan.close();
    }
}
