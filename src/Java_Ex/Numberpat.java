package Java_Ex;

import java.util.Scanner;

public class Numberpat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++){
//            int p=1;
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
//                p++;
            }
            System.out.println();
        }
    }
}
