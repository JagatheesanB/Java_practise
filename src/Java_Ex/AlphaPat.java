package Java_Ex;

import java.util.Scanner;

public class AlphaPat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int p=65;
            for(int j=0;j<=i;j++){
                System.out.print((char) p+" ");
                p++;
            }
            System.out.println();
        }

    }
}
