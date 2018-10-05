package tech.bts.javaExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String s = input.nextLine();
        System.out.print("Times: ");
        int n = input.nextInt();

        System.out.println(repeat(s, n));
        System.out.println(padLeft(s, n));
        System.out.println(padRight(s, n));
        System.out.println(listOfRange(3, 8));

    }

    /**Returns a String with "s" repeated "n" times*/
    public static String repeat(String s, int n) {
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
    public static String padLeft(String s, int n) {
        String result = "";
        int spaces = n - s.length();

        for (int i = 0; i < spaces; i++) {
            result += " ";
        }

        result += s;

        return result;
    }

    /**Returns a string where s is padded with spaces on the right until the resulting string has length n*/
    public static String padRight(String s, int n) {
        String result = s;
        int spaces = n - s.length();

        for (int i = 0; i < spaces; i++) {
            result += " ";
        }

        return result;
    }

    /**Returns a list of integer numbers from a to b*/
    public static List<Integer> listOfRange (int a, int b) {

        List<Integer> result = new ArrayList();

        for (int i = a; i <= b ; i++) {
            result.add(i);
        }
        return result;
    }
}
