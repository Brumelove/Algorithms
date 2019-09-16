import java.util.LinkedHashSet;

public class Mcb {


    public static void main(String[] args) {
        isComparable("11", "11", "11");


        reverse("tunde");

//        String word = "invigilation";
//        LinkedHashSet<Character> values = new LinkedHashSet<>();
//
//        for (Character character :
//                word.toCharArray()) {
//            values.add(character);
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(values);
//
//        System.out.println(stringBuilder.toString());
//        System.out.println(countPalindrome(11, 21));
//
//        System.out.println(removeHills("ghjaflfalkj"));
    }


    public static int countPalindrome(int number1, int number2) {
        int count = 0;

        for (int i = number1; i < number2; i++) {
            String figure = String.valueOf(i);
            int stringLenght = figure.length();
            String figureReverse = "";
            for (int j = stringLenght - 1; j >= 0; j--) {
                figureReverse = figureReverse + figure.charAt(j);
            }

            count += (figure.equalsIgnoreCase(figureReverse)) ? 1 : 0;
        }

        return count;
    }

    private static String removeHills(String value) {
        int setsOf5Count = value.length() / 5;
        System.out.println("Sets of 5 count " + setsOf5Count);

        char[] result = value.toCharArray();

        for (int i = 0; i < value.length(); i++) {
            if (value.length() - i > 4) {
                String fiveSet = value.substring(i, i + 5);
                System.out.println(fiveSet);
                if (isHillString(fiveSet)) {
                    for (int j = i; j < i + 5; j++) {
                        result[j] = '*';
                    }
                }
                //startingIndex += 1;
            }

        }

        return String.copyValueOf(result);
    }


    private static boolean isHillString(String value) {
        if (value.length() != 5) {
            return false;
        }

        if (value.charAt(0) != value.charAt(4)) {
            return false;
        }

        if (value.charAt(1) != value.charAt(3)) {
            return false;
        }

        if (value.charAt(1) <= value.charAt(0)) {
            return false;
        }

        if (value.charAt(2) <= value.charAt(1)) {
            return false;
        }

        return true;


    }

    private static boolean isComparable(String value, String b, String c) {
        if (value.contentEquals(b) || value.contentEquals(c)) {
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }
        return false;
    }

    static String reverse(String value) {
        String r = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            r = r + value.charAt(i);
        }
        if (value.equalsIgnoreCase(r)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        return r;

    }


}
