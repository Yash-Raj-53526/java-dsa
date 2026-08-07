package Strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Tony Stark";
        // System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + " at index -> " + i);
        }

        // compareTo method is used to compare two strings lexicographically. It returns
        // a positive integer if the first string is greater than the second string, a
        // negative integer if the first string is less than the second string, and 0 if
        // both strings are equal.
        String name1 = "Tony Stark";
        String name2 = "Tony Stark";
        // s1 > s2 -> positive value
        // s1 < s2 -> negative value
        // s1 == s2 -> 0

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // equals() method is used to compare the content of two strings. It returns
        // true if the content of both strings is the same, and false otherwise.
        if (name1.equals(name2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        String sentence = "my name is Yash Raj Pandey";
        // .substring(beginIndex, endIndex)
        String name3 = sentence.substring(11, 19);// endIndex is exclusive
        System.out.println(name3);

        // input email and print username
        // System.out.print("Enter your email: ");
        // String email = sc.next();
        // String username = email.substring(0, email.indexOf('@'));
        // System.out.println("Your username is: " + username);

        // reverse a string
        // stupid method
        String s2 = "Hello World";
        String reversed = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            reversed += s2.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
