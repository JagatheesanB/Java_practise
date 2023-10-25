package Java_Ex;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        int len = name.length();
        int flag = 0;

        for (int i = 0; i < len; i++) {
            if (name.charAt(i) != name.charAt(len - i - 1)) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("Not a Palindrome");
        } else System.out.println("Palindrome");
    }
}
