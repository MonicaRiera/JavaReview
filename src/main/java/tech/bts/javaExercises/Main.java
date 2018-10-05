package tech.bts.javaExercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String s = input.nextLine();
        System.out.print("Times repeated: ");
        int n = input.nextInt();

        System.out.println(repeat(s, n));

    }

    /**Returns a String with "s" repeated "n" times*/
    private static String repeat(String s, int n) {
        String result = "";

        if (s.equals("xxx")) {
            return result;
        } else {
            for (int i = 0; i < n; i++) {
                result += s;
            }
        }

        return result;
    }

    /**Returns a string where s is padded with spaces on the left until the resulting string has length n*/
    private static String padLeft(String s, int n) {
        String result = "";
        int spaces = n - s.length();

        return result;
    }
}
