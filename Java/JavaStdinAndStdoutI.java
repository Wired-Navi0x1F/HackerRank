import java.util.*;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        System.out.println("MyString is : " + s);

        int i = scan.nextInt();
        System.out.println("Integer is : " + i);

        scan.close();
    }
}
