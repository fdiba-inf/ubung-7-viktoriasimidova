package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

         for (int line = n - 1; line > 0; line--) {
            printLine(1, line);
         }

    }

    public static void printLine(int start, int end) {
        for (int number = start; number <= end; number++) {
           System.out.print(number);
           if (number != end) {
              System.out.print(" ");
           }
        }
         System.out.println();
    }
}
