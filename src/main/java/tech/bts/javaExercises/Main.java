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

        System.out.println(StringUtil.repeat(s, n));
        System.out.println(StringUtil.padLeft(s, n));
        System.out.println(StringUtil.padRight(s, n));
        System.out.println(listOfRange(3, 8));

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
