package Java_Ex;

import java.util.Scanner;

public class Char_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name = sc.nextLine();
        System.out.println("Enter a Character:");
        char c = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);


    }
}
