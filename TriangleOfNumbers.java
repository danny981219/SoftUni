<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);

            }

            System.out.println();

        }


    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);

            }

            System.out.println();

        }


    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
