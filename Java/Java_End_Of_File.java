import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_Of_File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line = 1;

        while (sc.hasNext()) {
            String text = sc.nextLine();
            System.out.println(line + " " + text);
            line++;
        }

        sc.close();
    }
}
