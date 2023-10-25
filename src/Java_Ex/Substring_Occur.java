package Java_Ex;

import java.util.Scanner;

public class Substring_Occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.next();
        System.out.println("Enter a String2:");
        String s1 = sc.next();
        System.out.println(s.split(s1,-1).length-1);

//        int L = s1.length();
//        int count=0;
//
//        for(int i=0;i<s.length()-L;i++){
//            if(s.substring(i,i+L).equals(s1)){
//               count++;
//           }
//        }
//        System.out.println(count);


    }
}
