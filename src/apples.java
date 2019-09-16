import java.util.Scanner;

public class apples {
    private static boolean isComparable(String value, String b, String c) {
        if (value.contentEquals(b) || value.contentEquals(c) ) {
            System.out.println("equal");

        }
        System.out.println("not equal");
        return false;
    }
}
